lst = []

n = int(input("Enter number of element :"))

for i in range(0, n):
    e = int(input())
    
    lst.append(e)
    
print(lst)
print("sum of element in given:", sum(lst))    