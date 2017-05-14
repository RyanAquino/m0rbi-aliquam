from django.conf.urls import url
from . import views

urlpatterns = [
    #/requests/
    url(r'^$', views.index, name='index'),
    #/requests/verdict
    url(r'^verdict/(?P<request_id>[0-9]+)', views.verdict, name='verdict'),
]