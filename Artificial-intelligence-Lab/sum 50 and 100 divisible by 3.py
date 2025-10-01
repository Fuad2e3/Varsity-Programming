total = 0

for n in range(50, 101):     # numbers from 50 to 100
    if n % 3 == 0 and n % 5 != 0:
        total = total + n

print("Sum =", total)
