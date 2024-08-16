N = int(input())  # 첫번째 수
result_list = []  # 숫자 list
max_cnt = 0  # result

# N부터 반복
for i in range(0, N):
    tmp_list = [N, N - i]

    while True:
        num = tmp_list[-2] - tmp_list[-1]

        if num >= 0:
            tmp_list.append(num)
        else:
            break

    if len(tmp_list) > max_cnt:
        max_cnt = len(tmp_list)
        result_list = tmp_list[:]

print(max_cnt)
print(*result_list)