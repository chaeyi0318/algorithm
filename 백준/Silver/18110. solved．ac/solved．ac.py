import sys

def my_round(num):
    return int(num) + (1 if num - int(num) >= 0.5 else 0)

n = int(sys.stdin.readline())

if not n:
    print(0)
else:
    tmp = [0] * n

    for i in range(n):
        tmp[i] = int(sys.stdin.readline())

    num = my_round(n * 0.15)
    arr = sorted(tmp)[num: n - num]
    avg = my_round(sum(arr) / len(arr))

    print(avg)