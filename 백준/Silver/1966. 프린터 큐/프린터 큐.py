from collections import deque

T = int(input())

for _ in range(T):
    N, M = map(int, input().split())  # N: 문서 개수, M: 궁금한 문서의 초기 인덱스
    tmp = list(map(int, input().split()))  # 중요도 리스트

    impt = deque(enumerate(tmp))  # 인덱스와 중요도를 함께 저장
    cnt = 0

    while impt:
        if impt[0][1] == max(impt, key=lambda x: x[1])[1]:
            cnt += 1
            idx, _ = impt.popleft()

            if idx == M:
                print(cnt)
                break
        else:
            impt.append(impt.popleft())
