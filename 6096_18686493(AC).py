d=[]

for i in range(19):
    d.append([])
    for j in range(19):
        d[i].append(0)
d = [list(map(int,input().split())) for _ in range(19)]

n=int(input())
for i in range(n):
    x,y=input().split()
    x = int(x)
    y = int(y)
    for j in range(19):
        if d[j][y-1]==0:
            d[j][y-1]=1
        else:
            d[j][y-1]=0
    for k in range(19):
        if d[x-1][k]==0:
            d[x-1][k]=1
        else:
            d[x-1][k]=0
for i in range(19):
    for j in range(19):
        print(d[i][j],end=' ')
    print()
