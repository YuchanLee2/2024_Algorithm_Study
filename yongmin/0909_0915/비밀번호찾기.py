
import sys 

input_alphabet = str(sys.stdin.readline()) 

# 방법 1
# c_index = input_alphabet.find("c")

# result = input_alphabet[:c_index]#.replace(" ", "")
# print(result)

# 방법 2
pre_c = input_alphabet.split("c")
result = pre_c + "c"
print(result)