from __future__ import print_function
import random

number = random.randint(1, 100)
while True:
    n_guess = int(raw_input("Make a guess: "))
    if n_guess > number:
        print("Too big!")
    elif n_guess < number:
        print("Too small!")
    else:
        print("You Got It!!!")
        break
