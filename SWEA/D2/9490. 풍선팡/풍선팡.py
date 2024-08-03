T = int(input())

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    max_value = 0

    for i in range(N):
        for j in range(M):
            cnt = arr[i][j]
            for k in range(len(dx)):
                for x in range(1, arr[i][j] + 1):
                    point_x = i + dx[k] * x
                    point_y = j + dy[k] * x

                    if 0 <= point_x < len(arr) and 0 <= point_y < len(arr[0]):
                        cnt += arr[point_x][point_y]
            if max_value < cnt:
                max_value = cnt

    print(f'#{tc} {max_value}')