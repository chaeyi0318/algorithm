T = 10

for _ in range(T):
    N = int(input())
    pattern = input()
    search_str = input()
    result = 0

    pattern_idx = 0
    compare_idx = 0

    while compare_idx < len(search_str):
        if search_str[compare_idx] != pattern[pattern_idx]:
            compare_idx = compare_idx - pattern_idx + 1
            pattern_idx = 0

            continue

        pattern_idx += 1
        compare_idx += 1

        if pattern_idx == len(pattern):
            result += 1
            pattern_idx = 0
            compare_idx = compare_idx - pattern_idx + 1
    print(f'#{N} {result}')