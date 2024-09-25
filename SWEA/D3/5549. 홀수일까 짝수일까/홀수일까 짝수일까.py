T = int(input())

for t in range(1, T + 1):
    N = int(input())
    print(f'#{t}','Odd' if N % 2 != 0 else 'Even')