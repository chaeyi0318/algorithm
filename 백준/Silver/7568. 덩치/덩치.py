import sys

N = int(sys.stdin.readline().strip())
person = []

for _ in range(N):
    w, h = map(int, sys.stdin.readline().split())
    person.append([w, h])

for size in person:
    rank = 1
    for comp in person:
        if size[0] < comp[0] and size[1] < comp[1]:
            rank += 1
    print(rank, end=' ')
