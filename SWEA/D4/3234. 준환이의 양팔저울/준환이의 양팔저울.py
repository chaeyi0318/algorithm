def find(n, k, lw, rw, ld, rd):
    global cnt
    if (lw < rw):
        return 0
    elif (n == k):
        return 1
    elif (d[ld][rd] != -1):
        return d[ld][rd]
    else:
        sum = 0
        for i in range(k):
            if (u[i] == 0):
                u[i] = 1
                p[n] = i
                sum += find(n + 1, k, lw + w[i], rw, ld + (1 << i), rd)
                sum += find(n + 1, k, lw, rw + w[i], ld, rd + (1 << i))
                u[i] = 0
        d[ld][rd] = sum
        return sum


T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    w = list(map(int, input().split()))
    rs = sum(w)
    p = [0] * N
    u = [0] * N

    d = [[-1] * (2 ** N) for i in range(2 ** N)]
    cnt = find(0, N, 0, 0, 0, 0)
    print('#{} {}'.format(tc, cnt))
