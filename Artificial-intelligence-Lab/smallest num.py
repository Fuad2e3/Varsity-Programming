num = 12, 3, 4, 5, 6

small = num[0]

for n in num:
    if n < small:
        print(n, "is smallest")
    else:
        print(n, "is not smallest")
    