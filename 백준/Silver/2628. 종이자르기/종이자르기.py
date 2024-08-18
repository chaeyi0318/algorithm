# 가로와 세로 길이, 자르기 명령 입력받기
w, h = map(int, input().split())
n = int(input())

# 가로와 세로 자르기 위치 리스트
rows = [0, h]
cols = [0, w]

# 0 3
# 1 4
# 0 2
for _ in range(n):
    direction, pos = map(int, input().split())
    if direction == 0:  # 가로 자르기
        rows.append(pos)
    else:  # 세로 자르기
        cols.append(pos)

# 정렬
rows.sort()
cols.sort()

# 최대 가로 길이와 세로 길이 계산
max_height = max(rows[i] - rows[i-1] for i in range(1, len(rows)))
max_width = max(cols[i] - cols[i-1] for i in range(1, len(cols)))

# 최대 넓이 출력
print(max_height * max_width)