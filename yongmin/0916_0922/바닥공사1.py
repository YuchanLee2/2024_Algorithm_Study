import math

length = int(input())
height = 2

# 1 x 2로는 무조건 채울 수 있음.
# 1 x 2의 개수로 기준

result = 0
n = length
for i in range(length, -1, -2):
    result += math.comb(n, i) # 방법의 가짓수
    n -= 1


print(result % 796796)