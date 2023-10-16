# 100이하의 소수(약수가 1과 자기자신)으로 이루어진 1차원 리스트 컴프리헨션으로 만들기
prime_number = []

for i in range(2, 101):
    for j in range(2, i):
        if i%j == 0:
            break
        elif i-1 == j :
            prime_number.append(i)

print(prime_number)

prime_number = []

for i in range(2, 101):
    isPrime = True
    for j in range(2, i):
        if i%j == 0:
            isPrime = False
            break
    if isPrime :
        prime_number.append(i)

print(prime_number)

# prime_number = [i for i in range(2, 101) if i%j !=0 for j in range(2, i)]

# print(prime_number)

#all함수 any함수
#여러 개의 조건 or 값이 있는 리스트, 튜플, set... 값의 조건에 따라 True or False 리턴하는 함수

#all함수 : 모든 값이 True일 때, True
#any함수 : 하나라도 True면 True 리턴한다.

number = [i+1 for i in range(10)] # 1...10
lst = [x for x in number if x % 2 == 0]

#all
res = all(x%2 == 0 for x in number)
print(res)

res = all(x%2 == 0 for x in lst)
print(res)

#any
res = any(x == 5 for x in number)
print(res)

res = any(x == 5 for x in lst)
print(res)

prime_number = [i for i in range(2, 101) if all(i%j !=0 for j in range(2, i))]
print(prime_number)


