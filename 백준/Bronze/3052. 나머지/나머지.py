number = []

for i in range(10):
  n = int(input())
  if n % 42 not in number:
    number.append(n % 42)
  
      
      
print(len(number))