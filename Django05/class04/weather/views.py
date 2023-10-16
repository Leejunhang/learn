from django.shortcuts import render, get_object_or_404
import requests
from .models import City
from .forms import CityForm

# Create your views here.
def index(request):
    url = 'http://api.openweathermap.org/data/2.5/weather?q={}&units=imperial&appid=API_KEY'
    
    cities = City.objects.all()

    if request.method == 'POST':
        form = CityForm(request.POST)
        if form.is_valid():
            form.save()
    
    form = CityForm()
    weather_data = []

    for city in cities:
        city_weather = requests.get(url.format(city)).json()

        weather = {
            'id' : city.id,
            'city' : city,
            'temperature' : round((city_weather['main']['temp']-32)*5/9, 1),
            'description' : city_weather['weather'][0]['description'],
            'icon' : city_weather['weather'][0]['icon'],
        }
        print(weather)
        weather_data.append(weather)

    context = {'weather_data' : weather_data, 'form' : form}

    return render(request, 'weather/index.html', context)

def detail(request, city_id) :
    url = 'http://api.openweathermap.org/data/2.5/weather?q={}&units=imperial&appid=API_KEY'

    city = get_object_or_404(City, pk=city_id)
    city_weather = requests.get(url.format(city)).json()

    weather = {
        'id' : city.id,
        'city' : city,
        'temperature' : round((city_weather['main']['temp']-32)*5/9, 1),
        'description' : city_weather['weather'][0]['description'],
        'lon' : city_weather['coord']['lon'],
        'lat' : city_weather['coord']['lat'],
    }
  
    return render(request, 'weather/detail.html', {'weather':weather})