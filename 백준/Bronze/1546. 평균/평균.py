test_case = int(input())

score_list = list(map(int, input().split()))

m = max(score_list)

for i in range(len(score_list)):
    score_list[i] = score_list[i] / m * 100

print(sum(score_list) / len(score_list))