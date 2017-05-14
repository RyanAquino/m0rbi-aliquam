from django.http import HttpResponse
from .models import Sp, Request, Service, Schedule, Client, Rate, Transaction, Appointments, Message
#from django.db import connection
from django.template import loader
from django.shortcuts import render, get_object_or_404
from django.template.defaulttags import register

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    template = loader.get_template('messages.html')
    return HttpResponse(template.render(get_context(request), request))

def get_context(request):
    sp_value = Sp.objects.filter(sp_id=1).values()[0]
    context = sp_value
    msg_arr = Message.objects.filter(sp_id=1).values()
    client_dict = msg_arr.values('client_id').distinct()
    client_list = []
    
    for i, c in enumerate(client_dict):
        c_id = c['client_id']
        client_list.append(msg_arr.filter(client_id=c_id).order_by('-date', '-time')[0])
        print(client_list)
        
    context['msg_dict'] = client_list
    context['client'] = Client.objects.all().values()
    context['message'] = Message.objects.all().values()
    
    return context

def view_msg(request, client_id):
    return render(request, 'view-messages.html', get_context(request))

def back_msg(request):
    return render(request, 'messages.html', get_context(request))

@register.filter
def get_client_msg(dictionary, value):
    #req_value = dictionary.values('request_id')
    #req_temp = Request.objects.filter(request_id=req_value).values('client_id')[0]
    #req = req_temp.pop('client_id')
    #client_ret = Client.objects.filter(client_id=req).values()[0]
    client_msg = dictionary.filter(client_id=value).values()[0]
    #first_name = client_msg.values('firstname')[0] 
    first_name = client_msg.pop('firstname')
    #last_name = client_msg.values('lastname')[0]
    last_name = client_msg.pop('lastname')
    client_name = first_name + " " + last_name
    return client_name

@register.filter
def get_date_msg(dictionary, value):
    date_msg = dictionary.filter(msg_id=value).values()[0]
    date_msg = date_msg.pop('date')
    return date_msg

@register.filter
def get_time_msg(dictionary, value):
    date_msg = dictionary.filter(msg_id=value).values()[0]
    date_msg = date_msg.pop('time')
    return date_msg

@register.filter
def get_msg(dictionary, value):
    date_msg = dictionary.filter(msg_id=value).values()[0]
    date_msg = date_msg.pop('msg')
    return date_msg
