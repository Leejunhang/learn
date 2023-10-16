import pandas as pd
import numpy as np

data = {
    'Name':['John', 'Anna', 'Peter', 'Linda'],
    'Age':[28,24,35,32],
    'City':['New York', "Paris", "Berlin", "London"]
}

df = pd.DataFrame(data)
df = df.sort_values('City', ascending=False)

# groupby : 데이터 특정 조건에 다라 그룹으로 분류하는 함수

data = pd.DataFrame({
    'City': ['Seoul', 'Seoul', 'Busan', 'Busan'],
    'Fruit': ['Apple', 'Banana', 'Apple', 'Banana'],
    'Quantity': [10, 15, 7, 12],
    'Price': [1000, 2000, 1500, 2500]
})

group = data.groupby(['City','Fruit'])['Quantity'].sum()

print(group)