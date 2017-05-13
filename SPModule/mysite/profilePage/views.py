from django.http import HttpResponse
from .models import Sp, Request
#from django.db import connection
from django.template import loader
from django.forms.models import model_to_dict
from django.shortcuts import render, get_object_or_404

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    template = loader.get_template('profile.html')
    spArray = Sp.objects.filter(sp_id=1).values()[0]
    context = spArray
    #spArray = {
    #    'lastname': 'Dela Cruz',
    #    'firstname': 'Juan',
    #}
    return HttpResponse(template.render(context, request))

def dashboard_view(request):
    return render(request, 'index.html')

def request_view(request):
    return render(request, 'requests.html')

def messages_view(request):
    return render(request, 'messages.html')

def transactions_view(request):
    return render(request, 'transactions.html')

def stats_view(request):
    return render(request, 'stats.html')