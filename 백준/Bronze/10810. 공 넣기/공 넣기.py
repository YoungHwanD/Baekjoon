N, M = map(int, input().split())
lst = [0] * N

for a in range(M):
    i, j, k = map(int, input().split())
    for b in range(i, j+1):
      lst[b - 1] = k
      
for c in range(N):
  print(lst[c])