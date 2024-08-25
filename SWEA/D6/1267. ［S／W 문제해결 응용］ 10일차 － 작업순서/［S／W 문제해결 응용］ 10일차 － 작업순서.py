T = 10

for t in range(1, T+1):
    v, e = map(int, input().split())
    graph = [[] for _ in range(v+1)]
    visited = [True for _ in range(v+1)]
    temp_list = list(map(int, input().split()))
    count = v
    result = []

    for i in range(0, len(temp_list), 2):
        a = temp_list[i]
        b = temp_list[i+1]
        graph[b].append(a)

    while count:
        for i in range(1, len(graph)):
            if visited[i]:
                for j in graph[i]:
                    if visited[j]:
                        break
                else:
                    visited[i] = False
                    result.append(i)
                    count -= 1
                    
    print('#{} '.format(t), end='')
    print(*result)