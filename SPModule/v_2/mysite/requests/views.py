from django.http import HttpResponse
from .models import Sp, Request, Service, Schedule, Client, Rate, Transaction
#from django.db import connection
from django.template import loader
from django.forms.models import model_to_dict
from django.shortcuts import render, get_object_or_404
from django.template.defaulttags import register
from django.utils.timezone import datetime
from datetime import datetime, timedelta
import string
 
def index(request):
    template = loader.get_template('requests.html')
    return HttpResponse(template.render(get_context(request), request))

def get_context(request):
    sp_value = Sp.objects.filter(sp_id=1).values()[0]
    context = sp_value
    context['all_request'] = Request.objects.filter(sp_id=1, status='pending').values()
    context['request'] = Request.objects.all().values()
    context['service'] = Service.objects.all().values()
    context['sched'] = Schedule.objects.filter(sp_id=1).values()
    context['client'] = Client.objects.all().values()
    return context

def verdict(request, request_id):
    req_id = request_id
    req = Request.objects.filter(request_id=req_id)
    if 'accept' in request.POST:
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'accepted')
        
        #getting service_id
        sched = Request.objects.filter(request_id=req_id).values()[0]
        sched = sched.pop('sched_id')
        sched_val = Schedule.objects.filter(sched_id=sched)
        sched_val.update(status='taken')
        serv = Schedule.objects.filter(sched_id=sched).values()[0]
        serv = serv.pop('service_id')
        
        #rate
        sp_id_f = Request.objects.filter(request_id=req_id).values()[0]
        sp_id_f = sp_id_f.pop('sp_id')
        rate_amt = Rate.objects.filter(sp_id=sp_id_f,service_id=serv).values()[0]
        rate_amt = rate_amt.pop('rate')
        days = Request.objects.filter(request_id=req_id).values()[0]
        days = days.pop('noofdays')
        rate_amt = noofdays * rate_amt
        
        #date, client
        today = datetime.now()
        client = Request.objects.filter(request_id=req_id).values()[0]
        client = client.pop('client_id')
        
        #create transaction
        trans = Transaction(status='ongoing',paid='unpaid',amount=rate_amt, request_id=req_id, date=today)
        trans.save()
        trans_o = trans.pop('transaction_id')
        
        #dates in appointment
        dow = dict(zip('monday tuesday wednesday thursday friday saturday sunday'.split(), range(7)))
        weekday = today.weekday()
        week_int = dateTimeObj + datetime.timedelta(days=(dow[reqDayOf.lower()]-weekday-1)%7+1)
    elif 'reject' in request.POST:  
        req = Request.objects.filter(request_id=req_id)
        req.update(status = 'rejected')
    return render(request, 'requests.html', get_context(request))

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
