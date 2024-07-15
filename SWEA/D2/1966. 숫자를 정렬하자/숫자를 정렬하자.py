T = int(input())

for i in range(1, T + 1):
    N = int(input())

    li = list(map(int, input().split()))

    li.sort()

    print(f"#{i}", *li)
