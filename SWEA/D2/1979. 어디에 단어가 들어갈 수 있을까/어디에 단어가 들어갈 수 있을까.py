T = int(input())

for t in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]

    result = 0

    for i in range(N):
        cnt = 0
        for j in range(N):
            if arr[i][j] == 1:
                cnt += 1
            else:
                if cnt == M:
                    result += 1
                cnt = 0
        if cnt == M:
            result += 1

    for i in range(N):
        cnt = 0
        for j in range(N):
            if arr[j][i] == 1:
                cnt += 1
            else:
                if cnt == M:
                    result += 1
                cnt = 0
        if cnt == M:
            result += 1

    print(f'#{t} {result}')