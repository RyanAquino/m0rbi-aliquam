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
    #spArray = {
    #    'lastname': 'Dela Cruz',
    #    'firstname': 'Juan',
    #}
    return HttpResponse(template.render(context, request))

def reject(request):
    req = Request.objects.filter()
    
def get_sched(request):
    sched_value = Schedule.objects.filter(sp_id=1, sched_id=1).values()[0]
    sched_time = Schedule.objects.filter(sp_id=1, sched_id=1).values('time')[0]
    sched_time['sched_time'] = sched_time.pop('time')
    sched_value.pop('time')
    sched_value = {**sched_value, **sched_time}
    
    return sched_value

@register.filter
def get_sched_time(dictionary, value):
    sched_time = dictionary.filter(sched_id=value).values()[0]
    return sched_time.pop('time')

@register.filter
def get_sched_day(dictionary, value):
    sched_day = dictionary.filter(sched_id=value).values()[0]
    return sched_day.pop('day')

@register.filter
def get_client(dictionary, value):
    client_ret = dictionary.filter(client_id=value).values()[0]
    client_name = client_ret.pop('firstname') + " " + client_ret.pop('lastname')
    return client_name

@register.filter
def get_service(dictionary, value):
    sched_ret = dictionary.filter(sched_id=value).values()[0]
    sched_value = sched_ret.pop('service_id')
    service_ret = Service.objects.filter(service_id=sched_value).values()[0]
    return string.capwords(service_ret.pop('description'))

@register.simple_tag
def accept(request_item):
    request_item['status'] = 'accepted'
    request_item.save()
    
    return index(request)

def dashboard_view(request):
    return render(request, 'index.html')

def profile_view(request):
    return render(request, 'profile.html')

def messages_view(request):
    return render(request, 'messages.html')

def transactions_view(request):
    return render(request, 'transactions.html')

def stats_view(request):
    return render(request, 'stats.html')