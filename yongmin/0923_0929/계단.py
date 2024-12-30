N, K = [int(i) for i in input().split(" ")]

remain = K - N
steps = 0
steps += remain // 3

if remain % 3 == 2:
    steps += 2
elif remain % 3 == 1:
    steps += 3
else:
    steps += 0

print(steps)