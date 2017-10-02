from __future__ import print_function
primes = []
n = 2
while n<100:
    is_prime = True
    for i in primes:
        if n % i == 0:
            is_prime = False
            break
    if is_prime:
        primes.append(n)
        print("%s" % (n))
    n+=1
