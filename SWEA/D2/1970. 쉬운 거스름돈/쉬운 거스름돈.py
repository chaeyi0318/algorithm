T = int(input())

for t in range(1, T + 1):
    N = int(input())

    money_dict = {
        50000: 0,
        10000: 0,
        5000: 0,
        1000: 0,
        500: 0,
        100: 0,
        50: 0,
        10: 0
    }

    while N > 9:
        for key in money_dict.keys():
            if N >= key:
                money_dict[key] += N // key
                N %= key

    print(f'#{t}')
    print(*money_dict.values())