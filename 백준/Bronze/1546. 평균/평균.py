N = int(input())
cnt = 0
score = list(map(int, input().split()))
m = max(score)

for j in range(N):
  score[j] = score[j] / m * 100
  cnt += score[j]
  
print(cnt / N)