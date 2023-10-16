import pandas as pd
import numpy as np

# 1000명의 사람 데이터 만들기
# 이름 : Person_1, Person_2, ... Person_1000
# 나이 : 20 ~ 60 랜덤
# 도시 : 특정 도시에서 랜덤으로 할당 ex) New York, Paris, Berlin, London, Seoul, Tokyo
np.random.seed(0)
data = pd.DataFrame({
    'Name': ['Person_' + str(i) for i in range(1, 1001)],
    'Age': np.random.randint(20, 60, 1000),
    'City': np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", 'Tokyo'], 1000)
})

print(data)
# 도시별 평균 나이 구하기
# 가장 많은 사람이 살고 있는 도시
# 연봉 추가해서 랜덤으로 할당 ex) $50,000 ~ $150,000
# 연봉 순서대로 정렬한 후 연봉 1등과 꼴등 출력해보기