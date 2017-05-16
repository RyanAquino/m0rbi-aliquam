from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.index, name='index'),
<<<<<<< HEAD
    url(r'^dashboard/$', views.dashboard_view, name='dashboard_view'),
    url(r'^profilePage/$', views.profile_view, name='profile_view'),
    url(r'^request/$', views.request_view, name='request_view'),
    url(r'^transactions/$', views.transactions_view, name='transactions_view'),
    url(r'^stats/$', views.stats_view, name='stats_view'),
=======
    url(r'^view_msg/(?P<client_id>[0-9]+)', views.view_msg, name='view_msg'),
    url(r'^view_msg/messages.html', views.back_msg, name='back_msg'),
>>>>>>> c110f0c527a240f94b9f485f3157562d7365a6a9
]