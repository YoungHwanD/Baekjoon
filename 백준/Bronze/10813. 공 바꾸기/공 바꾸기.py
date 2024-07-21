N, M = map(int, input().split())
basket = [0] * N

for a in range(N):
  basket[a] = a + 1
  
for b in range(M):
  i, j = map(int, input().split())
  k = basket[i - 1]
  basket[i - 1] = basket[j - 1]
  basket[j - 1] = k
  
for c in range(N):
  print(basket[c])
  