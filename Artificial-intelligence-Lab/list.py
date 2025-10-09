# list ()
a = list(("apple","banana"))
print(a)





# - Index
b = list(("apple","banana"))
print(b[-1])





# Range items
c = list(("apple","banana","cat"))
print(c[1:2])





# Append
d = list(("apple","banana"))
d.append("dog")
print(d)





# Insert 
e = list(("apple","banana"))
e.insert(1,"dog")
print(e)





# Remove
f = list(("apple","banana"))
f.remove("apple")
print(f)






# pop 
g = list(("apple","banana"))
g.pop(1)
print(g)





# loop
h = list(("apple","banana"))
for x in h:
 print(h)
 
 
 
 
 
 # Length
i = list(("apple","banana"))
print(len(i))





# sort
j = list((100, 2, 5, 50))
j.sort()
print(j)






# sort
j = list((100, 2, 5, 50))
j.reverse()
print(j)





# copy
k = list((100, 2, 5, 50))
a=k.copy()
print(a)





# join
l = (100, 2, 5, 50)
m = ("apple","banana")
n = l + m
print(n)