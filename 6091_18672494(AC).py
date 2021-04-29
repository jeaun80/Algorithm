a1,a2,a3=input().split(' ')

a1=int(a1)
a2=int(a2)
a3=int(a3)
d=1
while d%a1!=0 or d%a2!=0 or d%a3!=0:
    d=d+1
print(d)
