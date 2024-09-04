item_dict = {
    ']': '[',
    ')': '('
}

while True:
    txt = input()

    if txt == '.':
        break

    arr = list(txt)
    stack = []
    flag = True

    for i in range(len(arr)):
        if arr[i] in item_dict.values():
            stack.append(arr[i])
        elif arr[i] in item_dict.keys():
            if len(stack) != 0 and stack[-1] == item_dict[arr[i]]:
                stack.pop()
            else:
                flag = False
                break

    if flag and not stack:
        print('yes')
    else:
        print('no')