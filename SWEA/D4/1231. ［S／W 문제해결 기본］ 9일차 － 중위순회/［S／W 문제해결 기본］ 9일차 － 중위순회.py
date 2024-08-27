def inorder(node):
    if node == 0:
        return

    inorder(tree[node][0])
    result.append(char[node])
    inorder(tree[node][1])


for t in range(1, 11):
    N = int(input())  # 정점 수

    tree = [[0, 0] for _ in range(N + 1)]
    char = [0] * (N + 1)

    for i in range(1, N + 1):
        tmp = list(input().split())
        idx = int(tmp[0])
        char[idx] = tmp[1]

        for x in range(1, len(tmp)):
            if tmp[x].isdecimal():
                if tree[idx][0] == 0:
                    tree[idx][0] = int(tmp[x])
                else:
                    tree[idx][1] = int(tmp[x])

    result = []
    inorder(1)

    print(f'#{t}', ''.join(result))