for t in range(1, 11):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]

    result = 0

    # 열 우선 순회
    for j in range(len(arr)):
        check = 0     # 교착 상태를 체크할 변수
        for i in range(len(arr[j])):
            # arr[i][j]가 2(B, S극 자성체)이고 이 전에 체크된 1(A, N극 자성체)가 있으면 교착 상태이므로 result += 1
            # check 변수 0으로 재할당
            if arr[i][j] == 2 and check == 1:
                result += 1
                check = 0
            # arr[i][j]가 1이면 N극 자성체가 있는 경우니까 check에 표시
            elif arr[i][j] == 1:
                check = 1

    print(f'#{t} {result}')