import sys

T = int(sys.stdin.readline().strip())

for _ in range(T):
    floor = int(sys.stdin.readline().strip())
    num = int(sys.stdin.readline().strip())
    floor_0 = [i for i in range(1, num + 1)]
    
    for i in range(floor):
        for j in range(1, num):
            floor_0[j] += floor_0[j - 1]
    print(floor_0[-1])