import sys

N = int(input())
stack = []

for _ in range(N):
    stack.append(int(sys.stdin.readline()))

cnt = 0
max_height = 0

for i in range(N - 1, -1, -1):
    if stack[i] > max_height:
        cnt += 1
        max_height = stack[i]

print(cnt)