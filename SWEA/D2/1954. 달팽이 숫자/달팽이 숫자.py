dxy = [[0, 1], [1, 0], [0, -1], [-1, 0]]

T = int(input())

for t in range(1, T + 1):
    N = int(input())
    n_range = N * N
    arr = [[0] * N for _ in range(N)]

    num = 1
    dir = 0  # 0 : 우, 1 : 하, 2 : 좌, 3 : 상
    x, y = 0, 0

    while num <= n_range:
        if 0 <= x < N and 0 <= y < N and arr[x][y] == 0:
            arr[x][y] = num
            num += 1
        else:
            x -= dxy[dir][0]
            y -= dxy[dir][1]
            dir = (dir + 1) % 4

        x += dxy[dir][0]
        y += dxy[dir][1]

    print(f'#{t}')
    for result in arr:
        print(*result)