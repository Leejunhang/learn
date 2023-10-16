#연습문제 1
# x = int(input("x 입력 : "))
# y = int(input("y 입력 : "))
#
# print(x+y)
# print(x*y)
# print(x**y)

#연습문제 2
a = 11
b = 5.0

c = a//b
d = a%b

print(c)
print(d)

e = a**b

print(e)

#연습문제4
score1 = int(input())
score2 = int(input())
score3 = int(input())

print(score1 > 65 and score2 > 65 and score3 > 65)

#아 파이썬에서는 세미콜론(;) 안쓰는구나

print("과일"*3)

#연습문제5

word = "Apple Banana"
print(len(word))
print(word.replace("Banana", "Orange"))
print(word)
print(word.upper())
print(word.lower())
print(word.replace(' ', ''))

#연습문제 7
score = int(input("점수를 입력하세요 : "))

if (score >= 90) :
    print("축하합니다. 당신은 합격입니다.")
else :
    print("안타깝지만, 당신은 불합격입니다.")
