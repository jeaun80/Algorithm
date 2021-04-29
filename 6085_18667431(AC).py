w,h,b= input().split(' ')
w=int(w)
h=int(h)
b=int(b)


bit=w*h*b
bite=float(bit/8)
kb=float(bite/1024)
mb=float(kb/1024)
print("%.2f"%mb,"MB")
