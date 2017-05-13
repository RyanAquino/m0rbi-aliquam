from django.conf.urls import url
from . import views

urlpatterns = [
    #/requests/
    url(r'^$', views.index, name='index'),
    #/requests/verdict
    url(r'^verdict/', views.verdict, name='verdict'),
]