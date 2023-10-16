for i in range(0,10):
    print(i)

for i in range(0,10,2):
    print(i)

for i in range(10,0,-1):
    print(i)

for i in range(10):
    print(i)


x = int(input("몇 단을 출력할까 : "))

for i in range(1,10):
    print(x, " X ", i, " = ", x*i)

for i in range(2,10):
    print("------------", i, "단------------")
    for j in range(1,10):
        #print(str(i) + " X " + str(j) + " = " + str(i*j))
        print("%d X %d = %d" %(i,j,i*j))
    print()

# x = 1
# sum = 0
# while(x != 0):
#     x = int(input("값을 입력해주세요 : "))
#     sum += x
#
# print("합계는?", sum)

x = 1
sum = 0
while(True):
    x = int(input("값을 입력해주세요 : "))
    sum += x
    if x == 0:
        break

print("합계는?", sum)



#range(1.처음, 2.끝, 3.중간)
#1. 어디부터 시작할래?
#2. 어디까지 할래?
#3. 어떻게 진행할래?

#1,3 생략가능

#break, continue