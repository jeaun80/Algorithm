n = int(input())
m = input().split()
max=n
for i in range(0, n):
    if int(max)>int(m[i]):
        max=m[i]
print(max)
