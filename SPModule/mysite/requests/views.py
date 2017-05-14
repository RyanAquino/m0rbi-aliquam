from django.http import HttpResponse
from .models import Sp, Request, Service, Schedule, Client
#from django.db import connection
from django.template import loader
from django.forms.models import model_to_dict
from django.shortcuts import render, get_object_or_404
from django.template.defaulttags import register
import string

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    template = loader.get_template('requests.html')
    return HttpResponse(template.render(get_context(request), request))

def get_context(request):
    sp_value = Sp.objects.filter(sp_id=1).values()[0]
    context = sp_value
    #context = {**sp_value, **all_request}
    #context = {**context, **get_sched(request)}
    #context = {**context, **service_value}
    #service_value['description'] = string.capwords(service_value['description'])
    context['all_request'] = Request.objects.filter(sp_id=1, status='pending').values()
    context['request'] = Request.objects.all().values()
    context['service'] = Service.objects.all().values()
    context['sched'] = Schedule.objects.filter(sp_id=1).values()
    context['client'] = Client.objects.all().values()
    
    return context

def verdict(request, req_id):
    req = Request.objects.filter(request_id=req_id)
    if 'accept' in request.POST:
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'accepted')
    elif 'reject' in request.POST:  
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'rejected')
    
    return HttpResponse(template.render(get_context(request), request))

@register.filter
def get_sched_time(dictionary, value):
    sched_time = dictionary.filter(sched_id=value).values()[0]
    return sched_time.pop('time')

@register.filter
def get_sched_day(dictionary, value):
    sched_day = dictionary.filter(sched_id=value).values()[0]
    return sched_day.pop('day')

@register.filter
def get_client_req(dictionary, value):
    #req_value = dictionary.values('request_id')
    #req_temp = Request.objects.filter(request_id=req_value).values('client_id')[0]
    #req = req_temp.pop('client_id')
    #client_ret = Client.objects.filter(client_id=req).values()[0]
    first_name = dictionary.values('firstname')[0] 
    first_name = first_name.pop('firstname')
    last_name = dictionary.values('lastname')[0]
    last_name = last_name.pop('lastname')
    client_name = first_name + " " + last_name
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
