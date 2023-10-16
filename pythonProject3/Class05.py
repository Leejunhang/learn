#재귀함수(recursion function)
#1. 함수 내부에서 자기 자신 함수를 호출해야 한다.
#2. 재귀를 종료시켜주는 조건문이 존재해야 한다.

def test(end):
    if end == 0:
        return
    test(end-1)
    print(end)

test(5)

# 두 수 사이의 홀수 전부 출력
# print_odd(1,10) - 1 3 5 7 9

# 피보나치 수열 1 1 2 3 5 8 13 21 34 ...
# fibo(6) - 8

# 10진수 -> 2진수로 변환하기
# 10 - 1010
# 2 - 10
# binary(10) - 1010