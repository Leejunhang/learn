from django.urls import path
from weather import views

app_name = 'weather'

urlpatterns = [
    path('', views.index),
    path('detail/<int:city_id>/', views.detail, name='detail'),
]