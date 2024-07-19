N = int(input())

for i in range(N):
  N -= 1
  print((" " * N) + "*" * (i + 1))