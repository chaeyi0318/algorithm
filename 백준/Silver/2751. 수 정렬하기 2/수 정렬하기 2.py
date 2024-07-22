import sys

test_case = int(input())

num_list = []

for _ in range(test_case):
    num_list.append(int(sys.stdin.readline()))

num_list.sort()

for num in num_list:
    print(num)