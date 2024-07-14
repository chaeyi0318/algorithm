t = int(input())

for i in range(1, t + 1):
    print("#{} {}".format(i, round(sum(map(int, input().split())) / 10)))