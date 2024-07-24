num = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
word = input()
cnt = 0

for i in range(len(word)):
  for j in num:
    if word[i] in j:
      cnt += num.index(j) + 3
      
print(cnt)