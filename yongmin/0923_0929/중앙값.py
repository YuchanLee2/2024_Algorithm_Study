numbers = [int(i) for i in input().split(" ")]

numbers.sort()

idx = len(numbers) // 2
print(numbers[idx])