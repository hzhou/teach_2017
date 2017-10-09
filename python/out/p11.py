from __future__ import print_function
f_total = 0.0
k=1
while k<=1000000:
    f_total += (1.0/(2*k-1))
    k+=1
    f_total -= (1.0/(2*k-1))
    k+=1
f_total *= 4
print("total: %s" % (f_total))
