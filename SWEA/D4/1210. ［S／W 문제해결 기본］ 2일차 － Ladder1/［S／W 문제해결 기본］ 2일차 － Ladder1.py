T = 10
dx = [-1, 0, 0]
dy = [0, -1, 1]

for tc in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]
    point_x = 99
    point_y = 0

    for j in range(100):
        if arr[99][j] == 2:
            point_y = j

    while point_x != 0:
        for i in range(len(dx)):
            x = point_x + dx[i]
            y = point_y + dy[i]

            if 0 <= x < len(arr) and 0 <= y < len(arr) and arr[x][y] == 1:
                arr[x][y] = 0
                point_x, point_y = x, y

    print(f'#{tc} {point_y}')