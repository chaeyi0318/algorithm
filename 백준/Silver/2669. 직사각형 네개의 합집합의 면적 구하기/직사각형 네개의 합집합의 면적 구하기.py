arr = [[0] * 100 for _ in range(100)]  # 좌표 100까지

num_list = [list(map(int, input().split())) for _ in range(4)]  # 좌표 값
result = 0  # 결과

# ex) 1, 2, 4, 4
for x1, y1, x2, y2 in num_list:
    # y1 = 2 / y2 = 4
    for i in range(y1, y2):
        # x1 = 1, x2 = 4
        for j in range(x1, x2):
            arr[i][j] = 1

for i in range(len(arr)):
    for j in range(len(arr[i])):
        if arr[i][j] == 1:
            result += 1

print(result)