# This is an auto-generated Django model module.
# You'll have to do the following manually to clean this up:
#   * Rearrange models' order
#   * Make sure each model has one field with primary_key=True
#   * Make sure each ForeignKey has `on_delete` set to the desired behavior.
#   * Remove `managed = False` lines if you wish to allow Django to create, modify, and delete the table
# Feel free to rename the models, but don't rename db_table values or field names.
from __future__ import unicode_literals

from django.db import models


class Appointments(models.Model):
    app_id = models.IntegerField(primary_key=True)
    date = models.DateField()
    time = models.TimeField()
    status = models.CharField(max_length=7)
    request = models.ForeignKey('Request', models.DO_NOTHING)
    transaction = models.ForeignKey('Transaction', models.DO_NOTHING)

    class Meta:
        managed = False
        db_table = 'appointments'


class Category(models.Model):
    category = models.CharField(primary_key=True, max_length=45)
    description = models.CharField(max_length=150, blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'category'


class Client(models.Model):
    client_id = models.AutoField(primary_key=True)
    lastname = models.CharField(max_length=45, blank=True, null=True)
    firstname = models.CharField(max_length=45, blank=True, null=True)
    address = models.CharField(max_length=45, blank=True, null=True)
    gender = models.CharField(max_length=1, blank=True, null=True)
    birthday = models.DateField(blank=True, null=True)
    username = models.CharField(max_length=45)
    password = models.CharField(max_length=45)
    email = models.CharField(max_length=45)
    logstat = models.CharField(max_length=3)
    image = models.TextField(blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'client'


class Message(models.Model):
    msg_id = models.AutoField(primary_key=True)
    sp = models.ForeignKey('Sp', models.DO_NOTHING)
    client = models.ForeignKey(Client, models.DO_NOTHING)
    msg = models.CharField(max_length=150)
    time = models.TimeField()
    date = models.DateField()

    class Meta:
        managed = False
        db_table = 'message'


class Rate(models.Model):
    sp = models.ForeignKey('Sp', models.DO_NOTHING, primary_key=True)
    service = models.ForeignKey('Service', models.DO_NOTHING)
    rate = models.IntegerField()

    class Meta:
        managed = False
        db_table = 'rate'
        unique_together = (('sp', 'service'),)


class Request(models.Model):
    request_id = models.AutoField(primary_key=True)
    sp = models.ForeignKey('Sp', models.DO_NOTHING)
    client = models.ForeignKey(Client, models.DO_NOTHING)
    status = models.CharField(max_length=8)
    date = models.DateField()
    time = models.TimeField()
    sched = models.ForeignKey('Schedule', models.DO_NOTHING)

    class Meta:
        managed = False
        db_table = 'request'


class Schedule(models.Model):
    sched_id = models.AutoField(primary_key=True)
    sp = models.ForeignKey('Sp', models.DO_NOTHING)
    time = models.CharField(max_length=18)
    day = models.CharField(max_length=10)
    status = models.CharField(max_length=9)
    service = models.ForeignKey('Service', models.DO_NOTHING)

    class Meta:
        managed = False
        db_table = 'schedule'


class Service(models.Model):
    service_id = models.AutoField(primary_key=True)
    description = models.CharField(max_length=100)
    category = models.ForeignKey(Category, models.DO_NOTHING, db_column='category')

    class Meta:
        managed = False
        db_table = 'service'


class Sp(models.Model):
    sp_id = models.AutoField(primary_key=True)
    reg_status = models.CharField(max_length=7)
    lastname = models.CharField(max_length=30)
    firstname = models.CharField(max_length=30)
    gender = models.CharField(max_length=1)
    username = models.CharField(max_length=45)
    password = models.CharField(max_length=45)
    email = models.CharField(max_length=45)
    address = models.CharField(max_length=45)
    log_status = models.CharField(max_length=6)
    
    #def _str__(self):
    #    return self.lastname + ', ' + self.firstname

    class Meta:
        managed = False
        db_table = 'sp'


class Transaction(models.Model):
    transaction_id = models.AutoField(primary_key=True)
    status = models.CharField(max_length=15)
    paid = models.CharField(max_length=6)
    amount = models.IntegerField()
    request = models.ForeignKey(Request, models.DO_NOTHING)

    class Meta:
        managed = False
        db_table = 'transaction'
