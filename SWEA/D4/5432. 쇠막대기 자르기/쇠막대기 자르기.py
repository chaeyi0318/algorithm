T = int(input())

for t in range(1, T + 1):
    stick = list(input())
    stack = []
    result = 0

    for i in range(len(stick)):
        if stick[i] == '(':
            stack.append(stick[i])
        else:
            stack.pop()

            result += len(stack) if stick[i - 1] == '(' else 1

    print(f'#{t} {result}')