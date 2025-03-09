N = int(input())
sum = 0

for num in range(1, N + 1):
    sum += (N // num) * num

print(sum)