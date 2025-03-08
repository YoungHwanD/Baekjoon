N = int(input())
num_list = list(map(int, input().split()))
cnt_plus = 0


for num in num_list:
    cnt = 0
    if num == 1:
        continue

    for i in range(2, num):
        if num % i == 0:
            cnt += 1
    if cnt == 0:
        cnt_plus += 1

print(cnt_plus)
