from __future__ import print_function
year = 2017
cnt = 0
while 1:
    if year % 4==0 and (year % 100 != 0 or year % 400 == 0 ):
        print("%s" % (year))
        cnt+=1
        if cnt>=20:
            break
    year+=1
