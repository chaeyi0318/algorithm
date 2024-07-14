t = int(input())

arr = list(map(int, input().split()))

arr.sort()

print(arr[(t // 2)])
