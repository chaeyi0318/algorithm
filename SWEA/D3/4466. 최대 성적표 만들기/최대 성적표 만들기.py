T = int(input())

for t in range(1, T + 1):
    N, K = map(int, input().split())
    score = list(map(int, input().split()))
    result = 0

    for i in range(N - 1, 0, -1):
        for j in range(i):
            if score[j] < score[j + 1]:
                score[j], score[j + 1] = score[j + 1], score[j]

    for i in range(K):
        result += score[i]

    print(f'#{t}', result)