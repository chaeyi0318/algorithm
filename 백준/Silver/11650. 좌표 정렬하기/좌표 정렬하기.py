N = int(input())
arr = [list(map(int, input().split())) for _ in range(N)]

arr.sort(key=lambda x: (x[0], x[1]))

for value in arr:
    print(*value)