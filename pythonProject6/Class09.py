# 가위바위보 게임
import random

def play():
    user = int(input("1. 가위, 2. 바위, 3. 보를 입력하세요 : "))
    com = random.randrange(1,4)
    win = 0

    print()
    if user == com:
        print("무승부")

    if user == 1:
        if com == 2:
            print("패배")
        elif com == 3:
            print("승리")
            win += 1

    if user == 2:
        if com == 1:
            print("승리")
            win += 1
        elif com == 3:
            print("패배")

    if user == 3:
        if com == 1:
            print("패배")
        elif com == 2:
            print("승리")
            win += 1

def write_game():

def read_game():

while True:
    play()