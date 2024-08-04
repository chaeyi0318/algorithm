T = int(input())

for t in range(1, T + 1):
    N, Q = map(int, input().split())

    arr = [0] * N

    for n in range(1, Q + 1):
        L, R = map(int, input().split())

        for i in range(L - 1, R):
            arr[i] = n

    print(f'#{t}',*arr)