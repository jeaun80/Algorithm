h,b,c,s= input().split(' ')
h=int(h)
b=int(b)
c=int(c)
s=int(s)

bit=h*b*c*s
bite=float(bit/8)
kb=float(bite/1024)
mb=float(kb/1024)
print("%.1f"%mb,"MB")
