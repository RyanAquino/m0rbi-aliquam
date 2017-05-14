"""mysite URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/1.11/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.conf.urls import url, include
    2. Add a URL to urlpatterns:  url(r'^blog/', include('blog.urls'))
"""
from django.conf.urls import include, url
from django.contrib import admin

urlpatterns = [
    url(r'^dashboard/', include('dashboard.urls',  namespace='dashboard')),
    url(r'^profilePage/', include('profilePage.urls',  namespace='profilePage')),
    url(r'^requests/', include('requests.urls',  namespace='requests')),
    url(r'^messages/', include('messages.urls',  namespace='messages')),
    url(r'^transactions/', include('transactions.urls',  namespace='transactions')),
    url(r'^stats/', include('stats.urls',  namespace='stats')),
    url(r'^admin/', admin.site.urls),
]
