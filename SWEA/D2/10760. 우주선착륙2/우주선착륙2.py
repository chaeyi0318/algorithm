T = int(input())

dxy = [[-1, 0], [1, 0], [0, -1], [0, 1], [-1, 1], [1, 1], [1, -1], [-1, -1]]

for t in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    result = 0
    min_value = 4

    for i in range(len(arr)):
        for j in range(len(arr[i])):
            current = arr[i][j]
            cnt = 0

            for x in range(len(dxy)):
                ni = dxy[x][0] + i
                nj = dxy[x][1] + j

                if 0 <= ni < len(arr) and 0 <= nj < len(arr[i]) and arr[ni][nj] < current:
                    cnt += 1

            if cnt >= min_value:
                result += 1

    print(f'#{t}', result)