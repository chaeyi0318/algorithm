from collections import deque

def bfs(start):
    deq = deque([start])

    while deq:
        top = deq.popleft()

        for w in graph[top]:
            if visited[w] == 0:
                visited[w] = top
                deq.append(w)

T = int(input())

graph = [[] for _ in range(T + 1)]

for _ in range(T - 1):
    p, c = map(int, input().split())
    graph[p].append(c)
    graph[c].append(p)

visited = [0] * (T + 1)

bfs(1)

for i in range(2, T + 1):
    print(visited[i])