from django.http import HttpResponse
from .models import Sp, Request, Appointments, Message
#from django.db import connection
from django.template import loader
from django.shortcuts import render, get_object_or_404
from django.forms.models import model_to_dict
from django.core.urlresolvers import reverse

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    user_name = request.POST.get("username","")
    request.session['user'] = user_name
    
    
    
    template = loader.get_template('index.html')
    spArray = Sp.objects.filter(username=user_name).values()[0]
    spId = spArray['sp_id']
    
    app_count = Request.objects.filter(sp_id=spId, status='pending').count()
    req_count = Request.objects.filter(sp_id=spId, status='pending').count()
    msg_count = Message.objects.filter(sp_id=spId, status='unread').count()
    context = spArray
    context.update({'app_count': app_count, 'req_count': req_count})
    #spArray = {
    #    'lastname': 'Dela Cruz',
    #    'firstname': 'Juan',
    #}
    return HttpResponse(template.render(context, request))


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