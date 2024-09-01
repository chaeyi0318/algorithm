def binary_tree(lst, d):
    root = len(lst) // 2

    result[d].append(lst[root])

    if len(lst) == 1:
        return

    binary_tree(lst[:root], d + 1)
    binary_tree(lst[root + 1:], d + 1)

K = int(input())
arr = list(map(int, input().split()))
result = [[] for _ in range(K)]

root = arr[len(arr) // 2]

binary_tree(arr, 0)

for i in range(len(result)):
    print(*result[i])