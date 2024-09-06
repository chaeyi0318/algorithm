T = int(input())

for t in range(1, T + 1):
    N, K = map(int, input().split())
    arr = list(input())
    num_set = set()

    step = N // 4

    for _ in range(step):
        for i in range(0, N, step):
            tmp = ''.join(arr[i:i + step])
            num_set.add(tmp)
        arr.append(arr.pop(0))

    result = sorted([int(item, 16) for item in num_set], reverse=True)

    print(f"#{t} {result[K - 1]}")