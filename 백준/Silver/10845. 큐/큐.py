N = int(input())
queue = []

for n in range(N):
    q_str = input().split()

    if q_str[0] == 'push':
        for i in range(1, len(q_str)):
            queue.append(q_str[i])
    elif q_str[0] == 'pop':
        if not queue:
            print(-1)
        else:
            print(queue.pop(0))
    elif q_str[0] == 'size':
        print(len(queue))
    elif q_str[0] == 'empty':
        if not queue:
            print(1)
        else:
            print(0)
    elif q_str[0] == 'front':
        if not queue:
            print(-1)
        else:
            print(queue[0])
    elif q_str[0] == 'back':
        if not queue:
            print(-1)
        else:
            print(queue[-1])