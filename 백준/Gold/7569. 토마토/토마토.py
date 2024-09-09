import sys
from collections import deque

M, N, H = map(int, sys.stdin.readline().split())
box = [[list(map(int, sys.stdin.readline().split())) for _ in range(N)] for _ in range(H)]
visited = [[[False] * M] * N] * H

dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, -1, 1]

deq = deque()

for h in range(H):
    for n in range(N):
        for m in range(M):
            if box[h][n][m] == 1:
                deq.append((h, n, m))
                visited[h][n][m] = True

while deq:
    z, x, y = deq.popleft()

    for i in range(6):
        nz = dz[i] + z
        nx = dx[i] + x
        ny = dy[i] + y

        if 0 <= nz < H and 0 <= nx < N and 0 <= ny < M:
            if box[nz][nx][ny] == 0:
                box[nz][nx][ny] = box[z][x][y] + 1
                deq.append((nz, nx, ny))

result = 0
flag = True

for z in range(H):
    for x in range(N):
        for y in range(M):
            if box[z][x][y] == 0:
                flag = False
            result = max(box[z][x][y], result)

if flag:
    print(result - 1)
else:
    print(-1)