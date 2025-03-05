N = int(input())
num_list = list(map(int, input().split()))

max = 0
min = 1000000


for i in range(N):
    if num_list[i] > max:
        max = num_list[i]
    if num_list[i] < min:
        min = num_list[i]

print(max * min)

