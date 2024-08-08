def change_postfix(txt):
    stack = []
    postfix = ''

    for item in txt:
        if item.isdecimal():
            postfix += item
        else:
            while stack and operator[stack[-1]] >= operator[item]:
                postfix += stack.pop()
            stack.append(item)
    while stack:
        postfix += stack.pop()

    return postfix


def calculate(postfix):
    value_stack = []

    for data in postfix:
        if data.isdecimal():
            value_stack.append(int(data))
        else:
            n1 = value_stack.pop()
            n2 = value_stack.pop()

            if data == '+':
                result = n2 + n1
            elif data == '-':
                result = n2 + n1
            elif data == '*':
                result = n2 * n1
            elif data == '/':
                result = n2 / n1

            value_stack.append(result)

    return value_stack


operator = {
    '+': 1,
    '-': 1,
    '*': 2,
    '/': 2
}

for t in range(1, 11):
    N = int(input())
    txt = list(input())
    print(f'#{t}', *calculate(change_postfix(txt)))