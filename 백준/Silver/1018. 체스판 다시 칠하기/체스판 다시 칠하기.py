N, M = map(int, input().split())
arr = [input() for _ in range(N)]

# B 먼저 시작
pattern1 = [
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB'
]

# W 먼저 시작
pattern2 = [
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW',
    'WBWBWBWB',
    'BWBWBWBW'
]

min_cnt = 2500

for i in range(N - 7):
    for j in range(M - 7):
        pattern1_cnt = 0
        pattern2_cnt = 0

        for x in range(8):
            for y in range(8):
                if arr[i + x][j + y] != pattern1[x][y]:
                    pattern1_cnt += 1
                if arr[i + x][j + y] != pattern2[x][y]:
                    pattern2_cnt += 1

        min_cnt = min(min_cnt, pattern1_cnt, pattern2_cnt)

print(min_cnt)