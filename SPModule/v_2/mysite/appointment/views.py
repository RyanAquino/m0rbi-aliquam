from django.http import HttpResponse
from .models import Sp, Request, Service, Schedule, Client, Appointments, Message
#from django.db import connection
from django.template import loader
from django.forms.models import model_to_dict
from django.shortcuts import render, get_object_or_404
from django.template.defaulttags import register
from django.utils.timezone import datetime
from datetime import datetime, timedelta
import string

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    template = loader.get_template('appointments.html')
    return HttpResponse(template.render(get_context(request), request))

def get_context(request):
    sp_value = Sp.objects.filter(sp_id=1).values()[0]
    
    app_count = Request.objects.filter(sp_id=1, status='pending').count()
    req_count = Request.objects.filter(sp_id=1, status='pending').count()
    msg_count = Message.objects.filter(sp_id=1, status='unread').count()
    
    req = Request.objects.filter(sp_id=1, status='accepted').values('request_id')
    today = datetime.now()
    app = Appointments.objects.filter(status='ongoing', date__year=today.year, date__month=today.month, date__day=today.day, request_id__in=req).values()
    
    #context = {**sp_value, **all_request}
    #context = {**context, **get_sched(request)}
    #context = {**context, **service_value}
    #service_value['description'] = string.capwords(service_value['description'])
    context = sp_value
    context.update({'app_count': app_count, 'req_count': req_count, 'msg_count': msg_count})
    context['service'] = Service.objects.all().values()
    context['client'] = Client.objects.all().values()
    context['requests'] = Request.objects.all().values()
    context['app'] = app
    
    return context

<<<<<<< HEAD
def verdict(request, req_id):
    req = Request.objects.filter(request_id=req_id)
    if 'accept' in request.POST:
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'accepted')
    elif 'reject' in request.POST:  
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'rejected')
    
    return HttpResponse(template.render(get_context(request), request))

=======
>>>>>>> c110f0c527a240f94b9f485f3157562d7365a6a9
@register.filter
def get_end_time(dictionary, value):
    end_dict = dictionary.values('time')[0]
    end_time = end_dict.pop('time')
    day = dictionary.values('date')[0]
    day = day.pop('date')
    date_time = datetime.combine(day, end_time)
    fin = date_time + timedelta(hours=1)
    return fin.time()

@register.filter
def get_sched_day(dictionary, value):
    sched_day = dictionary.filter(sched_id=value).values()[0]
    return sched_day.pop('day')

@register.filter
def get_client_app(dictionary, value):
<<<<<<< HEAD
    first_name = dictionary.values('firstname')[0] 
    first_name = first_name.pop('firstname')
    last_name = dictionary.values('lastname')[0]
    last_name = last_name.pop('lastname')
    client_name = first_name + " " + last_name
=======
    #first_name = dictionary.values('firstname')[0] 
    #first_name = first_name.pop('firstname')
    #last_name = dictionary.values('lastname')[0]
    #last_name = last_name.pop('lastname')
    #client_name = first_name + " " + last_name
    #return client_name
    req_ret = Request.objects.filter(request_id=value).values()[0]
    req_value = req_ret.pop('client_id')
    client_ret = Client.objects.filter(client_id=req_value).values()[0]
    client_name = client_ret.pop('firstname') + " " + client_ret.pop('lastname')
>>>>>>> c110f0c527a240f94b9f485f3157562d7365a6a9
    return client_name

@register.filter
def get_service_req(dictionary, value):
    req_value = dictionary['request_id']
    req_temp = Request.objects.filter(request_id=req_value).values('sched_id')[0]
    sched_value = req_temp.pop('sched_id')
    sched = Schedule.objects.filter(sched_id=sched_value).values()[0]
    sched_f = sched.pop('service_id')
    service_ret = Service.objects.filter(service_id=sched_f).values()[0]
    return string.capwords(service_ret.pop('description'))
