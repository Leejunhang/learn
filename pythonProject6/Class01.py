str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"

# 숙제1 - 몇 개의 gpjgpj가 있는지 gpjgpjgpj - 1개 (겹치는 것 불가)
for i in range(10):
    if i==3:
        i = 8
    print(i)

# for(int i=0; i<str.length(); i++)

i = 0
count = 0
while i<len(str)-5:
    temp = ""
    for j in range(6):
        temp += str[i+j]
    #if str[i] + str[i+1] + str[i+2] ...
    if temp == "gpjgpj":
        count += 1
        i += 5
    i += 1

print(count)
count = 0
while len(str) >= 6:
    temp = ""
    for j in range(6):
        temp += str[j]

    if temp == "gpjgpj":
        count += 1
        str = str[6:]

    str = str[1:]

print(count)

# 숙제2 - 람다식으로 써보기
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
res = list(filter(lambda x : x[0] == "j", [str[i:i+3] for i in range(len(str) - 2)]))
print(res)
result = list(filter(lambda y : y == "jpg", res))
print(result)
print(list(filter(lambda y : y == "jpg", list(filter(lambda x : x[0] == "j", [str[i:i+3] for i in range(len(str) - 2)])))))
