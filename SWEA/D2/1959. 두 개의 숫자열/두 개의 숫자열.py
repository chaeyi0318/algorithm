T = int(input())

for t in range(1, T + 1):
    N, M = map(int, input().split())
    Ai = list(map(int, input().split()))
    Bj = list(map(int, input().split()))
    num_list = []
    # M이 큰 경우
    if M > N:
        for i in range(M - N + 1):
            result = 0

            for j in range(N):
                result += Ai[j] * Bj[j + i]

            num_list.append(result)
    elif N > M:
        for i in range(N - M + 1):
            result = 0

            for j in range(M):
                result += Ai[j + i] * Bj[j]
            num_list.append(result)

    print(f'#{t} {max(num_list)}')