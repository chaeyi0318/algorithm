N = int(input())
A = set(map(int, input().split()))
M = int(input())
M_arr = list(map(int, input().split()))

for i in range(M):
    if M_arr[i] in A:
        print(1)
    else:
        print(0)