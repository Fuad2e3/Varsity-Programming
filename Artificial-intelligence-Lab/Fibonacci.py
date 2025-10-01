a = 0
b = 1

for i in range(10):
    print(a, end=" ")
    c = a + b
    a = b
    b = c
