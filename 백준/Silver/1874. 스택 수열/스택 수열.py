N = int(input())
stack = []
result = []
flag = True

n = 1
for _ in range(N):
    num = int(input())

    while n <= num:
        stack.append(n)
        result.append('+')
        n += 1

    if stack[-1] == num:
        stack.pop()
        result.append('-')
    else:
        flag = False

if not flag:
    print('NO')
else:
    for v in result:
        print(v)
