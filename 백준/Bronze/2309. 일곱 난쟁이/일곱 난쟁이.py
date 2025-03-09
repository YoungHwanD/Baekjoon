arr = []

for i in range(9):
    arr.append(int(input()))

arr.sort()

sum = sum(arr)
n = []
for i in range(9):
    for j in range(i + 1, 9):
        if(len(n) == 2):
            continue

        if sum - arr[i] - arr[j] == 100:
            n.append(arr[i])
            n.append(arr[j])

for i in arr:
    if i in n:
        continue
    print(i)