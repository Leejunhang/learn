example = [[1,2,3], [4, [5,6,44,[6,5,67,[8,8]]]], 7, [8,9]] # [1,2,3,4,[5,6],7,8,9]
# 숙제
def flatten(data):
    flat_lst = []
    for i in data:
        if type(i) == list:
            flat_lst += flatten(i) #[1,2,3] - [4, [5,6]] - [8,9]
        else:
            flat_lst.append(i)
    return flat_lst

print(flatten(example)) #[1,2,3,4,5,6,7,8,9]

files=["memo.txt","1.jpg.jpg","32.png","23.jpg","223.jpg"]

print(list(filter(lambda x: x.find(".jpg") != -1, files)))
print(list(filter(lambda x: '.jpg' in x, files)))

for i in files:
    if ".jpg" in i:
        print(i)

# 숙제 - in, .find 사용하지 않고
print(list(filter(lambda x: ".jpg" == x[len(x)-4:], files)))

lst = []
for i in files:
    for j in range(len(i)):
        if(i[j] == '.') :
            if i[j+1:] == 'jpg':
                lst.append(i)
            break
print(lst)
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp" # 몇 개의 jpg가 들어가있는지
count = 0

for i in range(len(str)-2):
    if str[i] == 'j' and str[i+1] == 'p' and str[i+2] == 'g':
        count += 1

print(count)

lst = []

for i in range(len(str)-2):
    if str[i] + str[i+1] + str[i+2] == 'jpg':
        lst.append(str[i:i+3])
print(len(lst))
# 숙제2 - 람다식으로 써보기

# 숙제1 - 몇 개의 gpjgpj가 있는지 gpjgpjgpj - 1개 (겹치는 것 불가)



