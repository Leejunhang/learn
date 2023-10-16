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
def load_user():
    print()

def delete_user(delete):
    print("삭제가 완료되었습니다.")

while True:
    if menu() == -1:
        break