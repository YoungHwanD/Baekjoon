number = [0] * 30

for i in range(28):
  n = int(input())
  number[n-1] = n
  
for j in range(30):
  if number[j] == 0:
    print(j + 1)
