import sys
from collections import deque


def bfs(current, target):
    deq = deque([(current, 0)])
    visited[current] = 1

    while deq:
        node, dist = deq.popleft()

        if node == target:
            return dist

        for w in graph[node]:
            if visited[w] == 0:
                visited[w] = 1
                deq.append((w, dist + 1))

    return -1


N = int(sys.stdin.readline())
n1, n2 = map(int, sys.stdin.readline().split())
e = int(sys.stdin.readline())

graph = [[] for _ in range(N + 1)]
visited = [0 for _ in range(N + 1)]

for _ in range(e):
    p, c = map(int, sys.stdin.readline().split())
    graph[p].append(c)
    graph[c].append(p)

cnt = 0
print(bfs(n1, n2))
