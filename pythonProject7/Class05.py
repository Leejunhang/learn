# alice.txt에서 1. 단어가 총 몇개 있는지 - 2145
# 숙제 2. 어떤 단어가 있는지, 각 단어가 몇 개씩 있는지

with open('alice.txt', 'r') as f:
    contents = f.read()

# 구두점 제거
punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
for punctuation in punctuations:
    contents = contents.replace(punctuation, "")

contents = contents.replace("\n", " ")

print(contents.split())
print(len(contents.split()))