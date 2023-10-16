#1을 입력하면 홀수단(3, 5, 7, 9), 2를 입력하면 짝수단(2, 4, 6, 8) 출력
x = int(input('홀수단은 1, 짝수단은 2를 입력하세요 : '))

if(x == 1) :
    x = 3
for i in range(x,10,2): #1을 입력했을때, 3단부터... 2를 입력했을때, 2단부터...
    print("------------", i, "단------------")
    for j in range(1,10):
        print("%d X %d = %d" %(i,j,i*j))
    print()

for i in range(2,10):
    if (i % 2 == 1 and x == 1) or (i % 2 == 0 and x == 2):
        print("------------", i, "단------------")
        for j in range(1,10):
            print("%d X %d = %d" %(i,j,i*j))
        print()

for i in range(2,10):
    if (i % 2 == x - 1):
        continue
    print("------------", i, "단------------")
    for j in range(1,10):
        print("%d X %d = %d" %(i,j,i*j))
    print()
