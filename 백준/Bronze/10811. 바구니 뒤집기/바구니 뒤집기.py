N, M = map(int, input().split())
temp = 0
basket = [i for i in range(1, N + 1)]

for b in range(M):
  i, j = map(int, input().split())
  temp = basket[i - 1:j]
  temp.reverse()
  basket[i - 1:j] = temp
  
for c in range(N):
  print(basket[c], end = ' ')
