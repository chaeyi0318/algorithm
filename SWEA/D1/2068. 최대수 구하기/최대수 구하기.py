t = int(input())

for i in range(1, t + 1):
    print("#{} {}".format(i, max(map(int, input().split()))))