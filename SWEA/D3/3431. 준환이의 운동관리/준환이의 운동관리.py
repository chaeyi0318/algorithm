T = int(input())

for t in range(1, T + 1):
    L, U, X = map(int, input().split())
    result = 0

    if X < L:
        result = L - X
    else:
        if U < X:
            result = -1
        else:
            result = 0

    print(f'#{t} {result}')