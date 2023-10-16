x = int(input("찾고자 하는 값을 입력해주세요 : "))

a = [1,1,2,2,3,3]
print(a.count(x))

count = 0
# count 함수 원리 구현해보기
# for(int i=0; i<a.length; i++) {
#     if(x == a[i]) {
#         count++;
#     }
# }

for i in range(len(a)): #range(0, len(a), 1)
    if x == a[i]:
        count += 1

print(count)


a = [1,2,3]
a.reverse()
print(a) #[3,2,1]

b = []
# reverse 함수 원리 구현해보기
for i in range(len(a)-1, -1, -1): #for(int i=a.length-1; i>-1; i--)
    b.append(a[i])

print(b)

start, end = 0, len(a)-1
temp = 0
while end > start:
    temp = a[start]
    a[start] = a[end]
    a[end] = temp #a[start], a[end] = a[end], a[start]
    start += 1
    end -= 1

print(a)

for i in range(len(a)//2):
    temp = a[i]
    a[i] = a[len(a)-i-1]
    a[len(a) - i - 1] = temp

print(a)

# 3번
# list 함수 원리 구현해보기 (숫자로)
# s = 123456
# lst = list(s)
# print(lst)

#오답 1 :
s = "123456"
#오답 2 :
s = [1,2,3,4,5,6]
#오답 3 :
s = 123456
s2 = str(s)

# (1)[3,6,9,20,-7,5] 리스트를 sort와 같은 함수를 사용하지말고 for문을 활용하여 오름차순으로 정렬해주세요.

# 2x5 이차원 리스트 만들어서 1~10까지 채우기
lst = [
        [0,0],
        [0,0],
        [0,0],
        [0,0],
        [0,0]
      ]