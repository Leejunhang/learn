numbers= [12,32,55,12,32,4,86,50]
print(list(map(lambda x: "합격" if x>60 else "대기" if 50<x else "불합격", numbers)))

files=["memo.txt","1.jpg","32.png","23.jpg","223.jpg"]

print(list(filter(lambda x: x.find(".jpg") != -1, files)))
print(list(filter(lambda x: '.jpg' in x, files)))

for i in files:
    if ".jpg" in i:
        print(i)

# 숙제 - in, .jpg 사용하지 않고

# 리스트 세 개의 곱
lst1 = [1,2,3,4,5]
lst2 = [1,3,5,7,9]
lst3 = [2,4,8]
print(list(map(lambda x,y,z: x*y*z, lst1,lst2,lst3))) #[2, 24, 120]
print(list(map(lambda x: x[0]*x[1]*x[2], zip(lst1,lst2,lst3)))) #(1,1,2), (2,3,4), (3,5,8)

#1부터 10까지의 제곱 값 중 홀수만 출력해보기
a = list(map(lambda x: x*x, range(1,11)))
print(a)

print(list(filter(lambda x : x%2 == 1, a)))

print(list(filter(lambda x : x%2 == 1, map(lambda x: x*x, range(1,11)))))