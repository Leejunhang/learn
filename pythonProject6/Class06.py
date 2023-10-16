#파일 입출력

# 1. 파일 열기(open) - 파일을 열어서 객체를 생성한다. 모드 설정(읽기, 쓰기, 추가 등)
# 2. 파일 읽기(read) or 파일 쓰기(write) - 생성된 객체를 통해서 파일을 읽거나 쓸 수 있음.
# 3. 파일 닫기(close) - 파일 사용이 끝나면 반드시 닫아줘야 한다. 파일을 닫지 않으면, 메모리에 남아있어서 데이터 손실의 위험이 있다.

file = open("example.txt", "w")
file.write("안녕하세요.\n 파일 입출력 시간입니다.")
file.close()

file = open("example.txt", "r")
res = file.read()
for i in res:
    print(i, end="")
    if(i == '.'):
        print()
file.close()

with open("example.txt", "r") as file:
    res = file.read()
    print(res)

