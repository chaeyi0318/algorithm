from math import factorial

N = str(factorial(int(input())))
cnt = 0

for i in range(len(N) - 1, -1, -1):
    if N[i] == '0':
        cnt += 1
    else:
        print(cnt)
        break