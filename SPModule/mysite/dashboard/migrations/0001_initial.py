# -*- coding: utf-8 -*-
# Generated by Django 1.11.1 on 2017-05-09 20:53
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Appointments',
            fields=[
                ('app_id', models.IntegerField(primary_key=True, serialize=False)),
                ('date', models.DateField()),
                ('time', models.TimeField()),
                ('status', models.CharField(max_length=7)),
            ],
            options={
                'db_table': 'appointments',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Category',
            fields=[
                ('category', models.CharField(max_length=45, primary_key=True, serialize=False)),
                ('description', models.CharField(blank=True, max_length=150, null=True)),
            ],
            options={
                'db_table': 'category',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Client',
            fields=[
                ('client_id', models.AutoField(primary_key=True, serialize=False)),
                ('lastname', models.CharField(blank=True, max_length=45, null=True)),
                ('firstname', models.CharField(blank=True, max_length=45, null=True)),
                ('address', models.CharField(blank=True, max_length=45, null=True)),
                ('gender', models.CharField(blank=True, max_length=1, null=True)),
                ('birthday', models.DateField(blank=True, null=True)),
                ('username', models.CharField(max_length=45)),
                ('password', models.CharField(max_length=45)),
                ('email', models.CharField(max_length=45)),
                ('logstat', models.CharField(max_length=3)),
                ('image', models.TextField(blank=True, null=True)),
            ],
            options={
                'db_table': 'client',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Message',
            fields=[
                ('msg_id', models.AutoField(primary_key=True, serialize=False)),
                ('msg', models.CharField(max_length=150)),
                ('time', models.TimeField()),
                ('date', models.DateField()),
            ],
            options={
                'db_table': 'message',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Request',
            fields=[
                ('request_id', models.AutoField(primary_key=True, serialize=False)),
                ('status', models.CharField(max_length=8)),
                ('date', models.DateField()),
                ('time', models.TimeField()),
            ],
            options={
                'db_table': 'request',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Schedule',
            fields=[
                ('sched_id', models.AutoField(primary_key=True, serialize=False)),
                ('time', models.CharField(max_length=18)),
                ('day', models.CharField(max_length=10)),
                ('status', models.CharField(max_length=9)),
            ],
            options={
                'db_table': 'schedule',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Service',
            fields=[
                ('service_id', models.AutoField(primary_key=True, serialize=False)),
                ('description', models.CharField(max_length=100)),
            ],
            options={
                'db_table': 'service',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Sp',
            fields=[
                ('sp_id', models.AutoField(primary_key=True, serialize=False)),
                ('reg_status', models.CharField(max_length=7)),
                ('lastname', models.CharField(max_length=30)),
                ('firstname', models.CharField(max_length=30)),
                ('gender', models.CharField(max_length=1)),
                ('username', models.CharField(max_length=45)),
                ('password', models.CharField(max_length=45)),
                ('email', models.CharField(max_length=45)),
                ('address', models.CharField(max_length=45)),
                ('log_status', models.CharField(max_length=6)),
            ],
            options={
                'db_table': 'sp',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Transaction',
            fields=[
                ('transaction_id', models.AutoField(primary_key=True, serialize=False)),
                ('status', models.CharField(max_length=15)),
                ('paid', models.CharField(max_length=6)),
                ('amount', models.IntegerField()),
            ],
            options={
                'db_table': 'transaction',
                'managed': False,
            },
        ),
        migrations.CreateModel(
            name='Rate',
            fields=[
                ('sp', models.ForeignKey(on_delete=django.db.models.deletion.DO_NOTHING, primary_key=True, serialize=False, to='dashboard.Sp')),
                ('rate', models.IntegerField()),
            ],
            options={
                'db_table': 'rate',
                'managed': False,
            },
        ),
    ]
