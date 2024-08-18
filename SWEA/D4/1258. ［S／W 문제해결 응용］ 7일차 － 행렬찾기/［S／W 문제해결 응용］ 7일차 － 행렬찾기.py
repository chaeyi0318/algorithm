def find_end_width(i, j):
    cnt = 0

    for x in range(j, N):
        if arr[i][x] != 0:
            cnt += 1
        else:
            break

    return cnt


def find_end_height(i, j):
    cnt = 0

    for y in range(i, N):
        if arr[y][j] != 0:
            cnt += 1
        else:
            break

    return cnt


def visited(i, j, w, h):
    for x in range(i, i + h):
        for y in range(j, j + w):
            arr[x][y] = 0


T = int(input())

for t in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    result = []
    for i in range(N):
        for j in range(N):
            if arr[i][j] != 0:
                width = find_end_width(i, j)
                height = find_end_height(i, j)

                visited(i, j, width, height)

                result.append([width * height, height, width])

    for i in range(len(result) - 1, 0, -1):
        for j in range(i):
            if result[j][0] > result[j + 1][0]:
                result[j], result[j + 1] = result[j + 1], result[j]
            elif result[j][0] == result[j + 1][0]:
                if result[j][1] > result[j + 1][1]:
                    result[j], result[j + 1] = result[j + 1], result[j]

    print(f'#{t} {len(result)}', end=' ')

    for i in range(len(result)):
        for j in range(1, len(result[i])):
            print(result[i][j], end=' ')
    print()