year = 1899
cnt=0
while cnt<10:
    if year % 4 == 0 and (year % 100 >0 or year % 400 ==0):
        print(year)
        cnt+=1
    year += 1
