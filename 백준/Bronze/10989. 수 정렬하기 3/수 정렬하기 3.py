import sys

N = int(input())
cnt = [0] * 10001

for _ in range(N):
    num = int(sys.stdin.readline())
    cnt[num] += 1

for i in range(1, 10001):
    if cnt[i] != 0:
        for _ in range(cnt[i]):
            print(i)