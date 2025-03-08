M, N = map(int, input().split())
cnt_plus = 0

for num in range(M, N + 1):
    cnt = 0
    if num == 1:
        continue

    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            break

    else:
        print(num)

