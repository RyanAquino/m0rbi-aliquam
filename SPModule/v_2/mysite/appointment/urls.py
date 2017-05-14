from django.conf.urls import url
from . import views

urlpatterns = [
    #/appointment/
    url(r'^$', views.index, name='index'),
]