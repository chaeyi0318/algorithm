from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(start, end, maps):
    n, m = len(maps), len(maps[0])
    queue = deque([start])
    visited = [[-1] * m for _ in range(n)]
    visited[start[0]][start[1]] = 0

    while queue:
        x, y = queue.popleft()
        if (x, y) == end:
            return visited[x][y]
        
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and visited[nx][ny] == -1 and maps[nx][ny] != 'X':
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx, ny))
    
    return -1

def solution(maps):
    n, m = len(maps), len(maps[0])
    start, lever, exit = None, None, None
    
    for i in range(n):
        for j in range(m):
            if maps[i][j] == 'S':
                start = (i, j)
            elif maps[i][j] == 'L':
                lever = (i, j)
            elif maps[i][j] == 'E':
                exit = (i, j)

    dist_to_lever = bfs(start, lever, maps)
    if dist_to_lever == -1:
        return -1

    dist_to_exit = bfs(lever, exit, maps)
    if dist_to_exit == -1:
        return -1

    return dist_to_lever + dist_to_exit