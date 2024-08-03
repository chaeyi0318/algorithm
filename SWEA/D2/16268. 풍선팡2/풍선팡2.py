T = int(input())

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    max_value = 0

    for i in range(len(arr)):
        for j in range(len(arr[i])):
            cnt = arr[i][j]
            for k in range(len(dx)):
                point_x = i + dx[k]
                point_y = j + dy[k]

                if 0 <= point_x < N and 0 <= point_y < M:
                    cnt += arr[point_x][point_y]

            if max_value < cnt:
                max_value = cnt
    print(f'#{tc} {max_value}')
