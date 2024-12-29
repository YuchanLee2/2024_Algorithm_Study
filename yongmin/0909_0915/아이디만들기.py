import re

id_input = input()

# check1
if len(id_input) <= 20:
    # check2
    if id_input == re.findall(r'[A-Za-z]+', id_input)[0]:
        print("P")
    else:
        print("I")
else:
    print("I")