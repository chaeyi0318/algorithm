T = int(input())

for t in range(1, T + 1):
    station = [0] * 5001
    N = int(input())

    for n in range(N):
        A, B = map(int, input().split())
        for i in range(A, B + 1):
            station[i] += 1

    P = int(input())
    arr = [0] * P

    print(f'#{t}',end=' ')

    for _ in range(P):
        C = int(input())
        print(station[C], end=' ')
    print()