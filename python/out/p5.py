from __future__ import print_function
n_input = int(raw_input("Enter a number: "))
n_total = 0
for i in range(1,n_input+1):
    n_total += i
print("Total adding from 1 to %s is %s" % (n_input, n_total))
