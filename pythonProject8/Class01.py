#실습 02 - 숙제
import pickle

def menu():
    user = int(input("메뉴를 선택해주세요 (1-입력, 2-조회, 3-삭제, 0-종료):"))

    if user == 1:
        name = input("이름:")
        math = input("수학:")
        science = input("과학:")
        english = input("영어:")
        write_user(name, math, science, english)

    elif user == 2:
        load_user()

    elif user == 3:
        load_user()
        delete = int(input("삭제할 번호를 입력해주세요 : "))
        delete_user(delete)

    elif user == 0:
        print("종료되었습니다.")
        return -1
    return 0

def write_user(name, math, science, english):
    dic = {"이름":name, "수학":math, "과학": science, "영어": english}
    lst = []
    with open('data.p', 'rb') as f:
        item = pickle.load(f)

    if item != "":
        if type(item) == dict:
          lst.append(item)
        elif type(item) == list:
          lst += item

    lst.append(dic)
    with open('data.p', 'wb') as f:
        pickle.dump(lst, f)
def load_user():
    with open('data.p', 'rb') as f:
        data = pickle.load(f)

    for i in range(len(data)):
        # print(data[i])
        print(f'[{i}] 이름 : {data[i]["이름"]}, 수학 : {data[i]["수학"]}, 과학 : {data[i]["과학"]}, 영어 : {data[i]["영어"]}')

def delete_user(delete):
    with open('data.p', 'rb') as f:
        lst = pickle.load(f)

    if delete < 0 or delete >= len(lst):
        print("잘못된 입력입니다. 삭제할 수 없습니다.")
        return

    lst.pop(delete)

    with open('data.p', 'wb') as f:
        pickle.dump(lst, f)

    print("삭제가 완료되었습니다.")

try:
    with open('data.p', 'rb') as f:
        pickle.load(f)
except:
    with open('data.p', 'wb') as f:
        pickle.dump("", f)

while True:
    if menu() == -1:
        break