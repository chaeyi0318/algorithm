def solution(n):
    arr = list(map(int, str(n)))

    for i in range(len(arr) - 1, 0, -1):
        for j in range(i):
            if arr[j] < arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    return int(''.join(map(str, arr)))