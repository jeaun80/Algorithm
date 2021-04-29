a,m,d,n=input().split()
a=int(a)
m=int(m)
d=int(d)
n=int(n)
sum=a
for i in range(n-1):
    sum=(sum*m+d)
print(sum)

