a = input().split(' ')
b = input().split(' ')

finder = a[1]

# 원소를 찾을 수 없을 땐 -1을 출력하도록 예외처리
try:
    print(b.index(finder) + 1) 
except:
    print(-1)