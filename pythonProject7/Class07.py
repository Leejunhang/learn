# 2차원 배열에서 각 행과 각 열의 합을 구해보기
import numpy as np
# 1 2 3
# 4 5 6
# 7 8 9
arr = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(arr)
# 6 15 24
# 12 15 18

for i in range(len(arr)):
    print(arr[i].sum(), end=" ")
print()

for i in arr:
    print(i.sum(), end=" ")
print()

print(arr.transpose())

for i in arr.transpose():
    print(i.sum(), end=" ")
print()

print(arr)
print(arr.sum(axis=None))
print(arr.sum(axis=0))
print(arr.sum(axis=1))