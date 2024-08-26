N = int(input())

arr = set()

for i in range(N):
    arr.add(input())

result = sorted(list(arr), key=lambda x: (len(x), x))

for i in range(len(result)):
    print(result[i])
