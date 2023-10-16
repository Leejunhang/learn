from django.contrib import admin
from .models import Question, Choice

class ChoiceAdmin(admin.ModelAdmin):
	fieldsets = (
		('Choice', {'fields' : ['choice_text', 'votes'], 'classes' : ['collapse']}),
		('Question', {'fields' : ['question'], 'classes' : ['collapse']}) #파이썬 튜플은 하나짜리는 무조건 ,를 붙인다.
            )
	
	list_display = ('choice_text', 'question')
	list_filter = ('question',)
	search_fields = ['choice_text']
# Register your models here.
admin.site.register(Question)
admin.site.register(Choice, ChoiceAdmin)