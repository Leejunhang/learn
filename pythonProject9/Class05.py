import matplotlib.pyplot as plt
import matplotlib as mpl

mpl.rcParams['font.family'] = 'Malgun Gothic'
mpl.rcParams['axes.unicode_minus'] = False
# 데이터 생성
x = [1, 2, 3, 4]
y1 = [2, 4, 6, 8]
y2 = [3, 6, 9, 12]

# 선 그래프 그리기
plt.plot(x, y1, 'r', label='선 그래프 1')
plt.plot(x, y2,'b--', label='선 그래프 2')

# 범례(legend) 추가
plt.legend()

# 텍스트 추가
plt.text(2.5 ,7 , "문자열 출력", fontsize=12)

# 축 라벨 설정
plt.xlabel('X 축')
plt.ylabel('Y 축')

# 제목 설정
plt.title('선 그래프 예시')

# 눈금 설정
plt.xticks([1,2,3,4])
plt.yticks([0,5,10])

# 격자 표시
plt.grid(True)

# 차트 꾸미기
ax = plt.gca() # get current axes - 현재 활성화된 축 객체를 가져온다.
ax.spines["top"].set_visible(False) # - 스파인
ax.spines["right"].set_visible(False)
ax.spines["bottom"].set_linewidth(3)
ax.spines["left"].set_linewidth(3)
ax.tick_params(width=3)

# 차트 출력
plt.show()
