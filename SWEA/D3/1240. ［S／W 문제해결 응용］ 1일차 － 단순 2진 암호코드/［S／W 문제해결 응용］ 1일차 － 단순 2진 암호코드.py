def find_pw(arr):
    for i in range(len(arr)):
        if '1' in arr[i]:
            return arr[i]


T = int(input())

for t in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [input() for _ in range(N)]

    pw_pattern = {
        '0001101': 0,
        '0011001': 1,
        '0010011': 2,
        '0111101': 3,
        '0100011': 4,
        '0110001': 5,
        '0101111': 6,
        '0111011': 7,
        '0110111': 8,
        '0001011': 9
    }

    pw_line = find_pw(arr)

    # 오른쪽 끝에서부터 탐색 시작
    end_idx = pw_line.rfind('1')  # '1'이 마지막으로 등장하는 위치 찾기
    start_idx = end_idx - 55  # 56비트를 가져오기 위해 인덱스 설정
    code_line = pw_line[start_idx:end_idx + 1]  # 56비트 길이의 암호코드 추출

    even = 0
    odd = 0
    cnt = 1
    i = 0

    while i < len(code_line):
        if code_line[i:i + 7] in pw_pattern.keys():
            pattern = code_line[i:i + 7]

            if cnt % 2 != 0: odd += pw_pattern[pattern]
            else: even += pw_pattern[pattern]
            cnt += 1
            i += 7
        else:
            i += 1

    result = (odd * 3) + even

    print(f'#{t}', odd + even if result % 10 == 0 else 0)
