import sys

N = int(input())
arr = []

for _ in range(N):
    arr.append(int(sys.stdin.readline()))

print(round(sum(arr) / N))

arr.sort()

print(arr[N // 2])


item_dict = dict()

for i in arr:
    if i in item_dict:
        item_dict[i] += 1
    else:
        item_dict[i] = 1

max_value = max(item_dict.values())
max_lst = []

for i in item_dict:
    if max_value == item_dict[i]:
        max_lst.append(i)

if len(max_lst) == 1:
    print(max_lst[0])
else:
    print(sorted(max_lst)[1])

print(arr[N - 1] - arr[0])