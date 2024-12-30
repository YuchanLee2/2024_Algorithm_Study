N = int(input())
words = []

for i in range(N):
    word = input()
    words.append(word)
    
words = list(set(words))# 중복 제거

words.sort()
words.sort(key=len) # key = len 이게 핵심

for w in words:
    print(w)