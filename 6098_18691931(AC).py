d=[]
d = [list(map(int,input().split())) for _ in range(10)]
x=1
y=1
d[x][y]=9
while(d[x][y]!=2):
        if d[x][y+1]==0:
            y+=1
            d[x][y]=9
        elif d[x+1][y]==0:
            x+=1
            d[x][y]=9
        elif d[x][y+1]==2:
            d[x][y+1]=9
            break
        elif d[x+1][y]==2:
            d[x+1][y]=9
            break
        
        if d[x][y+1]==1 and d[x+1][y]==1:
            break
for i in range(10):
    for j in range(10):
        print(d[i][j],end=' ')
    print()
