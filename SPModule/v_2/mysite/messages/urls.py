from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.index, name='index'),
    url(r'^view_msg/(?P<client_id>[0-9]+)', views.view_msg, name='view_msg'),
    url(r'^view_msg/messages.html', views.back_msg, name='back_msg'),
]