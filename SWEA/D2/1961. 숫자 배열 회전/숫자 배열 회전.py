T = int(input())

for t in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    rotation_90 = [[0] * N for _ in range(N)]
    rotation_180 = [[0] * N for _ in range(N)]
    rotation_270 = [[0] * N for _ in range(N)]

    print(f'#{t}')
    for i in range(N):
        for j in range(N):
            rotation_90[i][j] = arr[len(arr) - 1 - j][i]
            rotation_180[i][j] = arr[len(arr) - 1 - i][len(arr) - 1 - j]
            rotation_270[i][j] = arr[j][len(arr) - 1 - i]

        print(''.join(map(str, rotation_90[i])),end=' ')
        print(''.join(map(str, rotation_180[i])),end=' ')
        print(''.join(map(str, rotation_270[i])))