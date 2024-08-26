T = int(input())

for t in range(1, T + 1):
    N = int(input())  # 전선 개수
    arr = [list(map(int, input().split())) for _ in range(N)]

    arr.sort()

    cnt = 0  # 교차점 수

    for i in range(1, N):
        for j in range(i):  # A는 더 낮지만 B가 더 높은 경우 교차
            if arr[j][1] > arr[i][1]:
                cnt += 1

    print(f'#{t} {cnt}')