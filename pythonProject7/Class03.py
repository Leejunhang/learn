# 가위바위보 게임
import random

def play():
    total_game, win_game = read_game().split(',')
    win = 0
    print(f"TOTAL : {total_game}, WIN : {win_game}")

    user = int(input("1. 가위, 2. 바위, 3. 보를 입력하세요 : "))
    com = random.randrange(1,4)

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

    write_game(int(total_game)+1, int(win_game)+win)

def write_game(total, win):
    with open("game.txt", 'w') as f:
        f.write(str(total)+","+str(win)) #111

def read_game():
    try:
        with open("game.txt", 'r') as f:
            contents = f.read()
    except:
        #return "0,0"
        with open("game.txt", 'w') as f:
            f.write("0,0")
            contents = "0,0"
    return contents

while True:
    play()