#람다(lambda)는 익명 함수를 생성하는 키워드다. 코드를 짧게 만드는데 사용됨.
#함수를 만들 때, 간단한 함수를 만든다. 매개변수, return, def.. 과정들이 너무 번거롭기 때문에

# lambda arguments: expression

def add(x,y):
    return x+y

add_lambda = lambda x,y: x+y
# lambda 람다 키워드
# arguments 매개변수 x,y
# expression 표현식 x+y

print(add(3,4))
print(add_lambda(3,4))

# map 함수 - 파이썬 내장 함수
# 주어진 함수를 반복 가능한(iterable) 객체의 각 원소에 적용하고, 결과를 반환한다.

# map(function, iterable) -> 원래 객체의 각 원소에 해당 함수를 적용한 결과

def square(x) :
    return x * x

lst = [1,2,3,4,5]
square_list = map(square, lst)
lst = list(square_list)

lst = [1,2,3,4,5]
square_list = map(lambda x: x*x, lst)
lst = list(square_list)

print(lst)

a = [1,2,3,4,5,6,7,8,9,10]

for i in range(len(a)):
    if a[i] %2 == 0:
        a[i] = 0

print(a)

def f(x):
    if x%2 == 0:
        return 0
    else:
        return x

for i in range(len(a)):
    a[i] = f(a[i])

print(a)

a = [1,2,3,4,5,6,7,8,9,10]
print(list(map(f,a)))
a = [1,2,3,4,5,6,7,8,9,10]
print(list(map(lambda x: 0 if x%2==0 else x,a)))

# filter 함수 - 파이썬 내장 함수
# 주어진 함수를 반복 가능한(iterable) 객체의 결과가 참인 원소들만 반환한다.

# filter(fuction, iterable)

def is_even(x): #return값이 boolean
    return x%2 == 0

lst = [1,2,3,4,5]

even_lst = filter(is_even, lst)
even_lst = filter(lambda x: x%2 == 1, lst)

print(list(even_lst))
