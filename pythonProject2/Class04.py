#min, max, sum
lst = [1,2,3,4,5,6,7,8,9]

print(max(lst))
print(min(lst))
print(sum(lst))

maxNum = lst[0]
minNum = lst[0]
sumNum = 0

for i in lst:
    if maxNum < i:
        maxNum = i

    if minNum > i:
        minNum = i

    sumNum += i

print("max : ", maxNum, ", min : ", minNum, ", sum : ", sumNum)

#split, join
fruit = "apple,pear,corn,carrot"
fruit_list = fruit.split(",")
print(fruit_list)

fruit = "-".join(fruit_list)
print(fruit)

fruit = "apple,pear,corn,carrot"
for i in fruit:
    if i == ',':
        print(end=" ")
    else :
        print(i, end = "")
print()
fruit_list = []
s = ''
for i in fruit:
    if i == ',':
        fruit_list.append(s)
        s = ''
    else :
        s += i
fruit_list.append(s)

print(fruit_list)

fruit = "apple,pear,corn,carrot"
fruit_list = []
s = 0

for i in range(len(fruit)):
    if fruit[i] == ',' or fruit[i] == '-' or fruit[i] == '+':
        fruit_list.append(fruit[s:i])
        s = i + 1

fruit_list.append(fruit[s:len(fruit)])

print(fruit_list)

# 아스키코드
print(ord('z')) #ordinal position
print(chr(97)) #character

# 기계어- - -(컴퓨터) - 어셈블리어 - 고급언어 - - -(사람)

fruit = "apple,./+pear-25-corn,carrot"
fruit_list = []
s = 0
for i in range(len(fruit)):
    if not((ord(fruit[i]) >= 65 and ord(fruit[i]) <= 90) or (ord(fruit[i]) >= 97 and ord(fruit[i]) <= 122)):
        if fruit[s:i] != "": # s != i-1
            fruit_list.append(fruit[s:i])
        s = i + 1

fruit_list.append(fruit[s:len(fruit)])

print(fruit_list)

fruit = "carrotapplecornpear" #만약 구분자가 없다면, 단어 데이터베이스
fruit_list = ['apple', 'pear', 'corn', 'carrot'] # 임시 데이터베이스
lst = []

s = ''
for i in fruit:
    s += i

    for j in fruit_list :
        if s == j :         #if s in fruit_list:
            lst.append(s)
            s = ''

if s in fruit_list:
    lst.append(s)

print(lst)