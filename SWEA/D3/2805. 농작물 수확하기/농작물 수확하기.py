T = int(input())

for t in range(1, T + 1):
    N = int(input())
    farm = [list(map(int, input())) for _ in range(N)]

    start = N // 2
    end = N // 2
    result = 0

    for i in range(len(farm)):
        for j in range(start, end + 1):
            result += farm[i][j]

        if i < N // 2:
            start -= 1
            end += 1
        else:
            start += 1
            end -= 1
    print(f'#{t}', result)