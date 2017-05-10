from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.index, name='index'),
    url(r'^$dashboard', views.dashboard_view, name='dashboard_view'),
    url(r'^profilePage/$', views.profile_view, name='profile_view'),
    url(r'^request/$', views.request_view, name='request_view'),
    url(r'^messages/$', views.messages_view, name='messages_view'),
    url(r'^transactions/$', views.transactions_view, name='transactions_view'),
]