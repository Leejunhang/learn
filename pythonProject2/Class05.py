a = [i for i in range(10)]
#a = [i] a에 [i]를 넣겠다.
#i가 뭔데?
#for i in range(10) : 0...9
#a = [0...9]

print(a)

a = [i for i in range(10) if i%2 == 0]
#a = [i] a에 [i]를 넣겠다.
#i가 뭔데?
#for i in range(10) i는 0...9야
#if i%2 == 0 i는 2로 나눈 나머지가 0이야
#a = [0,2,4,6,8]

print(a)

a = [i*j for i in range(2, 10) for j in range(1, 10)]
#a = [i*j] a에 i*j를 넣겠다.
#i가 뭔데?
#for i in range(2, 10) i는 2...9야
#j는 뭔데?
#for j in range(1, 10) j는 1...9야

print(a)

a = [0,0,0,0,0,0,0,0,0,0]
a = [i for i in range(10) if i == 0] # a에 i를 넣을거야, i는 0...9야, 근데 i가 0일때만 넣어줘

a = [i*0 for i in range(10)]
a = [i-i for i in range(10)] #0...9
a = [0 for _ in range(10)] #0...9
print(a)

word=["school","game","piano","science","hotel","mountain"]
a = [i for i in word if len(i)>=6]
a = [word[i] for i in range(len(word)) if len(word[i]) >= 6]

a = [len(i) for i in word]

#두 개의 리스트 곱하기
a = [[10,20],[30,40],[50,60]]
b = [[2,3],[4,5],[6,7]]

# [[1,2],[3,4],[5,6]] 리스트 컴프리헨션으로 만들기

# 2차원 10x10 리스트 0으로 채우기 컴프리헨션으로 만들기

# 100이하의 소수(약수가 1과 자기자신)으로 이루어진 1차원 리스트 컴프리헨션으로 만들기