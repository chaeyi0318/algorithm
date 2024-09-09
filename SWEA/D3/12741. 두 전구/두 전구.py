T = int(input())
result_list = []        # 결과 저장

for t in range(1, T + 1):
    A, B, C, D = map(int, input().split())

    # 나중에 켜진 전구 시간이 시작점
    start = max(A, C)

    # 먼저 꺼진 전구 시간이 끝점
    end = min(B, D)

    result = end - start

    if result <= 0:
        result = 0

    result_list.append(result)

for idx, result in enumerate(result_list):
    print(f'#{idx + 1}', result)