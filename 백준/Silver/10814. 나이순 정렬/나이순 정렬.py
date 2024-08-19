N = int(input())
mem = []

for n in range(N):
    age, name = input().split()
    mem.append([n, int(age), name])

mem = sorted(mem, key=lambda x: (x[1], x[0]))
# 시간초과
# for i in range(N - 1):
#     for j in range(N - 1 - i):
#         if mem[j][1] > mem[j + 1][1]:
#             mem[j], mem[j + 1] = mem[j + 1], mem[j]
#         elif mem[j][1] == mem[j + 1][1]:
#             if mem[j][0] > mem[j + 1][0]:
#                 mem[j], mem[j + 1] = mem[j + 1], mem[j]

for i in range(len(mem)):
    print(mem[i][1], mem[i][2])