T = 10

for tc in range(1, T + 1):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]
    r_line = 0
    l_line = 0
    result = 0

    for i in range(len(arr)):
        row = 0
        col = 0

        for j in range(len(arr)):
            row += arr[i][j]
            col += arr[j][i]

        result = max(col, row, result)

        r_line += arr[i][i]
        l_line += arr[i][len(arr) - 1 - i]

        result = max(r_line, l_line, result)

    print(f'#{tc} {result}')