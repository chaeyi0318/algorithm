def solution(tickets):
    graph = {}

    for start, end in tickets:
        if start not in graph:
            graph[start] = []
        graph[start].append(end)
    
    for key in graph:
        graph[key].sort(reverse=True)
    
    stack = ["ICN"]
    path = []
    
    while stack:
        top = stack[-1]
        
        if top not in graph or not graph[top]:
            path.append(stack.pop())
        else:
            stack.append(graph[top].pop())
    
    return path[::-1]
