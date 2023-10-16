# 두 수 사이의 홀수 전부 출력
# print_odd(1,10) - 1 3 5 7 9

# 피보나치 수열 1 1 2 3 5 8 13 21 34 ...
# fibo(6) - 8

# 10진수 -> 2진수로 변환하기
# 10 - 1010
# 2 - 10
# binary(10) - 1010

def print_odd(start, end):
    if start == end:
        return
    elif start%2 == 1:
        print(start)
    print_odd(start+1, end)

print_odd(100,200)

def fibo(n): # 피보나치 수열 1 1 2 3 5 8 13 21 34 ... 처음 두 개의 숫자가 1이고, 그 이후에는 앞의 두 숫자의 합
    if n == 1 or n == 2:
        return 1
    return fibo(n-2) + fibo(n-1)

#fibo(3) = fibo(1) + fibo(2)
#fibo(4) = fibo(2) + fibo(3)
#fibo(5) = fibo(3) + fibo(4)
#fibo(6) = fibo(4) + fibo(5)
#fibo(n) = fibo(n-2) + fibo(n-1)

print(fibo(6))

def binary(n):
    if n<1:
        return
    binary(n//2)
    print(n%2, end="")

# 2로 몇번 나누어지는지?
# 10 - 1010 = 1010
# 2 - 10
binary(10) #binary(5) -> binary(2) -> binary(1) -> binary(0)
print()
binary(50)

example = [[1,2,3], [4, [5,6]], 7, [8,9]] # [1,2,3,4,[5,6],7,8,9]
# if type(data) == list:

print()
lst = [[1,2,3],[4,5,6]] #[1][3]
empty_lst = []
for i in range(len(example)): #1 -> 2 #[1,2,3], [4, [5,6]], 7, [8,9]
    if type(example[i]) == list:
        for j in range(len(example[i])): #3
            if type(example[i][j]) == list:
                for k in range(len(example[i][j])):
                    empty_lst.append(example[i][j][k])
            else:
                empty_lst.append(example[i][j])
    else:
        empty_lst.append(example[i])
print(empty_lst)

# 숙제
def flatten(data):
    flat_lst = []
    for i in data:
        if type(i) == list:

        else:

    return flat_lst

print(flatten(example)) #[1,2,3,4,5,6,7,8,9]






