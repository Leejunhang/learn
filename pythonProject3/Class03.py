lst = [1,2,3,1,4,2,1]

def allindex(lst, a):
    temp = []
    for i in range(len(lst)):
        if lst[i] == a:
            temp.append(i)
    return temp

print(allindex(lst,1)) #[0,3,6]


person1 = ["치킨", "피자", "족발", "삼겹살"]
person2 = ["김밥", "김치찌개", "삼겹살", "쌈밥"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]

# all, any를 사용하여 공통된 음식 찾기 일단 두명부터
res = any(food in person2 for food in person1)
common_foods = [food for food in person1 if any(food == food2 for food2 in person2)]

print(res)
print(common_foods)

lst = [food for food in common_foods if any(food==food3 for food3 in person3)]
print(lst)

