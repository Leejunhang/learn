# Pandas
# 데이터 분석 및 조작을 위한 라이브러리 (Numpy 기반)
import numpy as np
import pandas as pd

# Series : 1차원 배열 구조
# DataFrame : 2차원 배열 구조

# CSV, Excel, SQL 쿼리

# Series
s = pd.Series([1,3,4, np.nan, 6, 8])
print(s)
print(s[3])

s = pd.Series([1,3,4, np.nan, 6,8], index=['A','B','C','D','E', 'F'])
print(s)
print(s['C'])

# DataFrame
data = {
    'Name':['짱구', '철수', '훈이'],
    'Age':[5,5,5]
}

df = pd.DataFrame(data)

print(df)
print('----------------------')
print(df['Name'])
print('----------------------')
print(df.loc[0]) # 이름
print('----------------------')
print(df.iloc[0]) # 위치