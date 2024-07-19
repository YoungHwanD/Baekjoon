MAX = 0
num = 0
lst = []

for i in range(9):
  lst.append(int(input()))
  if lst[i] > MAX:
    MAX = lst[i]
    num = i
    
print(MAX)
print(num + 1)