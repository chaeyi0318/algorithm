T = int(input())

for _ in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))

    num_dict = dict()

    for i in range(len(arr)):
        if arr[i] in num_dict.keys():
            num_dict[arr[i]] += 1
        else:
            num_dict[arr[i]] = 1

    sort_dict = sorted(num_dict.items(), key=lambda x: (x[1], x[0]), reverse=True)
    print(f'#{N}', sort_dict[0][0])