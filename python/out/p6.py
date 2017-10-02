from __future__ import print_function
n_input = int(raw_input("Enter a number: "))
s_type = raw_input("add or multiply: ")
if s_type == "add":
    n_total = 0
    for i in range(1,n_input+1):
        n_total += i
else:
    n_total = 1
    for i in range(1,n_input+1):
        n_total *= i
print("Total %s from 1 to %s is %s" % (s_type, n_input, n_total))
