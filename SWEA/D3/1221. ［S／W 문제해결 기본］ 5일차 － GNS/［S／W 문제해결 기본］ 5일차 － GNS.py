T = int(input())

num_dict = {
    'ZRO': 0,
    'ONE': 1,
    'TWO': 2,
    'THR': 3,
    'FOR': 4,
    'FIV': 5,
    'SIX': 6,
    'SVN': 7,
    'EGT': 8,
    'NIN': 9
}

for tc in range(1, T + 1):
    case, length = input().split()
    data = list(input().split())

    cnt = [0] * 10
    n = len(data)
    result = [0] * n

    for i in range(n):
        cnt[num_dict[data[i]]] += 1

    for i in range(1, 10):
        cnt[i] += cnt[i - 1]

    for i in range(n - 1, -1, -1):
        cnt[num_dict[data[i]]] -= 1
        idx = cnt[num_dict[data[i]]]
        result[idx] = data[i]
        
    print(case)
    print(*result)