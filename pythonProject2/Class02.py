# name = input('이름 : ')
# ageInput = int(input('나이 : '))
# phone = input('연락처 : ')

# dic = {"name": name, "age": ageInput, "phone": phone}

#print(dic)

# dic = dict(name = name, age = ageInput, phone = phone)

#print(dic)

lst = []
while True:
    name = input('이름 : ')
    ageInput = int(input('나이 : '))
    phone = input('연락처 : ')

    if ageInput == 0:
        break

    dic = {"name": name, "age": ageInput, "phone": phone}
    lst.append(dic)
    print(lst)

print(lst)