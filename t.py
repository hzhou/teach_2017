import random
# testing git

number = random.randint(1,100)
# print(number)
while 1:
    print("make a guess:")
    t = input()
    t = int(t)
    if t<number:
        print("too small")
    elif t>number:
        print("too big")
    else:
        print("you got it!")
        break

