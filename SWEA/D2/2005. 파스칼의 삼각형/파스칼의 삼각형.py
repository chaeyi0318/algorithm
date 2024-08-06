T = int(input())

def triangle(N):
    arr = [[0] * N for _ in range(N)]
    arr[0][0] = 1

    for i in range(1, len(arr)):
        for j in range(len(arr[i])):
            if i - 1 < 0:
                arr[i][j] = 1
            else:
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]
    return arr

for t in range(1, T + 1):
    N = int(input())

    result = triangle(N)

    print(f'#{t}')

    for i in range(len(result)):
        for j in range(len(result[i])):
            if result[i][j] != 0:
                print(result[i][j], end=' ')
        print()