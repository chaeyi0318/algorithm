def bfs(start):
    global cnt
    visited = [0] * (N + 1)
    q = []
    q.append(start)
    visited[start] = 1

    while q:
        t = q.pop(0)

        for w in graph[t]:
            if visited[w] == 0:
                q.append(w)
                visited[w] = 1
                cnt += 1

T = int(input())

for t in range(T):
    N, M = map(int, input().split())        # N 국가, M 비행기 종류
    graph = [[] for _ in range(N + 1)]
    cnt = 0
    for i in range(M):
        p, c = map(int, input().split())
        graph[p].append(c)
        graph[c].append(p)

    bfs(1)
    print(cnt)


# T = int(input())

# for t in range(T):
#     N, M = map(int, input().split())

#     for i in range(M):
#         c, a = map(int, input().split())

#     print(N - 1)
