from django.http import HttpResponse
from .models import Sp
#from django.db import connection
from django.template import loader

#def my_custom_sql(self):
#    with connection.cursor() as cursor:
#        cursor.execute("SELECT * FROM sp WHERE sp_id = 1")
#        row = cursor.fetchone()

#    return row

def index(request):
    all_sp = Sp.objects.all()
    template = loader.get_template('dashboard/index.html')
    context = {
        'all_sp': all_sp,
    }
    return HttpResponse(template.render(context, request))


# Create your views here.
