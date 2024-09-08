from collections import deque


def solution(maps):
    dxy = [[-1, 0], [1, 0], [0, -1], [0, 1]]

    def bfs(x, y):
        deq = deque()
        deq.append((x, y))

        while deq:
            x, y = deq.popleft()

            for i in range(4):
                nx = x + dxy[i][0]
                ny = y + dxy[i][1]

                if 0 <= nx < len(maps) and 0 <= ny < len(maps[0]) and maps[nx][ny] == 1:
                    maps[nx][ny] = maps[x][y] + 1
                    deq.append((nx, ny))

        return maps[len(maps) - 1][len(maps[0]) - 1]

    answer = bfs(0, 0)

    return -1 if answer == 1 else answer