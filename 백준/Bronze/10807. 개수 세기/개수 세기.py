N = int(input())
l = list(map(int, input().split()))
v = int(input())
cnt = 0

for i in range(N):
  if l[i] == v:
    cnt += 1
    
print(cnt)