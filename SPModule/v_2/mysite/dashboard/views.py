from django.http import HttpResponse
from .models import Sp, Request, Appointments, Message, Service, Client, Schedule
#from django.db import connection
from django.template import loader
from django.shortcuts import render, get_object_or_404
from django.forms.models import model_to_dict
from django.core.urlresolvers import reverse
from django.utils.timezone import datetime
from django.template.defaulttags import register
import string

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    template = loader.get_template('index.html')
    spArray = Sp.objects.filter(sp_id=1).values()[0]
    app_count = Request.objects.filter(sp_id=1, status='pending').count()
    req_count = Request.objects.filter(sp_id=1, status='pending').count()
    msg_count = Message.objects.filter(sp_id=1, status='unread').count()
    
    req = Request.objects.filter(sp_id=1, status='accepted').values('request_id')
    today = datetime.today()
    app = Appointments.objects.filter(status='ongoing', date__year=today.year, date__month=today.month, date__day=today.day, request_id__in=req).values()
    
    context = spArray
    context.update({'app_count': app_count, 'req_count': req_count, 'msg_count': msg_count})
    context['service'] = Service.objects.all().values()
    context['client'] = Client.objects.all().values()
    context['requests'] = Request.objects.all().values()
    context['app'] = app
    #spArray = {
    #    'lastname': 'Dela Cruz',
    #    'firstname': 'Juan',
    #}
    return HttpResponse(template.render(context, request))

#def get_app():
#    req = Request.objects.filter(sp_id=1, status='accepted').values('request_id')
#    today = datetime.today()
#    app = Appointments.objects.filter(status='ongoing', date__year=today.year, date__month=today.month, date__day=today.day).values()
    #app = app_temp.filter(request_id__in=req)
#    return app

@register.filter
def get_sched_time(dictionary, value):
    sched_time = dictionary.filter(sched_id=value).values()[0]
    return sched_time.pop('time')

@register.filter
def get_sched_day(dictionary, value):
    sched_day = dictionary.filter(sched_id=value).values()[0]
    return sched_day.pop('day')

@register.filter
def get_client_dash(dictionary, value):
    req_ret = Request.objects.filter(request_id=value).values()[0]
    req_value = req_ret.pop('client_id')
    client_ret = Client.objects.filter(client_id=req_value).values()[0]
    client_name = client_ret.pop('firstname') + " " + client_ret.pop('lastname')
    return client_name

@register.filter
def get_client_add(dictionary, value):
    req_ret = Request.objects.filter(request_id=value).values()[0]
    req_value = req_ret.pop('client_id')
    client_ret = Client.objects.filter(client_id=req_value).values()[0]
    client_add = client_ret.pop('address')
    return client_add

@register.filter
def get_service_dash(dictionary, value):
    req_id = dictionary.values('request_id')
<<<<<<< HEAD
    req_ret = Request.objects.filter(request_id=req_id).values()[0]
=======
    req_ret = Request.objects.filter(request_id__in=req_id).values()[0]
>>>>>>> c110f0c527a240f94b9f485f3157562d7365a6a9
    sched_value = req_ret.pop('sched_id')
    sched = Schedule.objects.filter(sched_id=sched_value).values()[0]
    req_value = sched.pop('service_id')
    service_ret = Service.objects.filter(service_id=req_value).values()[0]
    return string.capwords(service_ret.pop('description'))


def profile_view(request):
    return render(request, 'profile.html')

def request_view(request):
    return render(request, 'requests.html')

def messages_view(request):
    return render(request, 'messages.html')

def transactions_view(request):
    return render(request, 'transactions.html')

def stats_view(request):
    return render(request, 'stats.html')