import numpy as np

arr = np.random.rand(3,3)
print(arr)
print(np.sort(arr))

#숙제3. 10X10 배열에서 서로 다른 두 원소를 선택해서 두 원소의 차이의 절대값이 가장 작은 두 원소를 찾아보기
# 두 원소의 차이의 절대값이 가장 큰 두 원소를 찾아보기

arr = np.random.rand(10,10)
arr = arr.flatten()
print(arr.max() - arr.min())
sorted_arr = np.sort(arr)

print(sorted_arr)
print(sorted_arr[sorted_arr.argmax()] - sorted_arr[sorted_arr.argmin()])

min = sorted_arr[sorted_arr.argmax()] - sorted_arr[sorted_arr.argmin()]
min_index = 0
for i in range(len(sorted_arr)-1):
    diff = abs(sorted_arr[i] - sorted_arr[i+1])

    if diff < 0:
        diff *= -1

    if diff < min:
        min = diff
        min_index = i

print(f"첫번째 원소 : {sorted_arr[min_index]}, 두번째 원소 : {sorted_arr[min_index+1]}, 최소값 : {min}")