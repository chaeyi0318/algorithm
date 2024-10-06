from collections import deque

# 입력 받기
N, M = map(int, input().split())
arr = [list(map(int, input().strip())) for _ in range(N)]  # N으로 수정
visited = [[[0] * 2 for _ in range(M)] for _ in range(N)]  # 방문 배열 초기화
visited[0][0][0] = 1  # 시작점 방문 처리

# 이동 방향: 좌, 우, 상, 하
dxy = [[0, -1], [0, 1], [-1, 0], [1, 0]]

# BFS 함수 정의
def bfs(a, b, c):
    q = deque()
    q.append((a, b, c))

    while q:
        x, y, z = q.popleft()

        if x == N - 1 and y == M - 1:
            return visited[x][y][z]

        for i in range(4):
            nx = x + dxy[i][0]
            ny = y + dxy[i][1]

            if not (0 <= nx < N and 0 <= ny < M):
                continue

            if arr[nx][ny] == 1 and z == 0:
                if visited[nx][ny][1] == 0:
                    visited[nx][ny][1] = visited[x][y][0] + 1
                    q.append((nx, ny, 1))

            elif arr[nx][ny] == 0 and visited[nx][ny][z] == 0:
                visited[nx][ny][z] = visited[x][y][z] + 1
                q.append((nx, ny, z))

    return -1

print(bfs(0, 0, 0))