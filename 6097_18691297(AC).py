d=[]
k,p = map(int, input().split())
for i in range(k):
    d.append([])
    for j in range(p):
        d[i].append(0)

#d = [list(map(int,input().split())) for _ in range(k)]

n=int(input())# n=막대 몇번놓을지 횟수
for i in range(n):
    length,wich,x,y=map(int,input().split())
    for j in range(length):
        if wich==1:
            d[x-1][y-1]=1
            x+=1
        elif wich==0:
            d[x-1][y-1]=1
            y+=1
for i in range(k):
    for j in range(p):
        print(d[i][j],end=' ')
    print()
