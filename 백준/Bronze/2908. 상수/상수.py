N, M = input().split()
N = int(N[::-1])
M = int(M[::-1])

if N > M:
  print(N)
else:
  print(M)