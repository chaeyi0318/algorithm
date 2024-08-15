T = int(input())

for t in range(1, T + 1):
    N, K = map(int, input().split())  # N = 학생 수 / K = 과제 제출한 학생 수
    arr = list(map(int, input().split()))  # 제출한 번호
    result = []

    for i in range(1, N + 1):
        if i not in arr:
            result.append(i)

    for i in range(len(result) - 1, 0, -1):
        for j in range(i):
            if result[j] > result[j + 1]:
                result[j], result[j + 1] = result[j + 1], result[j]

    print(f'#{t}', *result)