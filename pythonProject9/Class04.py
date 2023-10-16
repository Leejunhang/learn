import matplotlib.pyplot as plt  # MATHLAB
import numpy as np

# 데이터 생성
x = np.linspace(0, 10, 100)
y = np.sin(x)

# 선그래프 생성
plt.plot(x, y)

# 그래프 꾸미기
plt.title('Sine 그래프')
plt.xlabel('Time')
plt.ylabel('Sine of Time')

# 그래프 출력
plt.show()

# matplotlib - 가장 기본적인 데이터 시각화 라이브러리
# 2D 그래프 특화 - 3D 일부
# 선 그래프, 막대 그래프, 히스토그램, 산점도...

# Seaborn - matplot 기반으로 고급 통계 차트