T = int(input())

for test_case in range(1, T + 1):
    num = int(input())
    
    num_dict = {
        2 : 0,
        3 : 0,
        5 : 0,
        7 : 0,
        11 : 0
    }

    for i in num_dict.keys():
        while True:
            if num % i == 0:
                num_dict[i] += 1
                num /= i
            else:
                break

    print(f'#{test_case} {" ".join(map(str, list(num_dict.values())))}')