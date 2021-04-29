r,g,b=input().split(" ")
r= int(r)
g=int(g)
b=int(b)
d=0
for i in range(r):
    for j in range(g):
        for k in range(b):
            print("%d %d %d" %(i,j,k))
            d= d+1
print(d)

