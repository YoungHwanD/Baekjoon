import sys

for i in range(100):
  a, b = map(int, sys.stdin.readline().split())
  if a == 0 and b == 0:
    break
  print(a + b)