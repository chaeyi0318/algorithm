def check_str(str_list):
    stack = []

    for i in range(len(str_list)):
        if str_list[i] == '(':
            stack.append(str_list[i])
        elif str_list[i] == ')':
            if len(stack) == 0:
                return 'NO'
            else:
                if stack[-1] == '(':
                    stack.pop()
                else:
                    return 'NO'
    if len(stack) == 0:
        return 'YES'
    else:
        return 'NO'


T = int(input())

for t in range(T):
    stack = []
    str_list = list(input())

    print(check_str(str_list))