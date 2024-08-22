M, N = map(int, input().split())
arr = [True] * (N + 1)
arr[0] = arr[1] = False

for i in range(2, N + 1):
    if arr[i]:
        for j in range(2 * i, N + 1, i):
            arr[j] = False

for i in range(M, N + 1):
    if arr[i]:
        print(i)