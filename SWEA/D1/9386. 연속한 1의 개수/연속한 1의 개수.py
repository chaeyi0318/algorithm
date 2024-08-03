T = int(input())

for tc in range(1, T + 1):
    N = int(input())
    arr = list(input())

    cnt = 0
    result = 0

    for i in range(N):
        if arr[i] == '1':
            cnt += 1
            result = cnt if cnt > result else result
        elif arr[i] == '0':
            cnt = 0

    print(f'#{tc} {result}')