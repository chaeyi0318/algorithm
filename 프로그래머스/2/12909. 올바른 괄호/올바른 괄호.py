def solution(s):
    stack = []

    for i in range(len(s)):
        if s[i] == '(':
            stack.append(s[i])
        elif s[i] == ')' and len(stack) != 0:
            stack.pop()
        elif s[i] == ')' and len(stack) == 0:
            return False
    if len(stack) == 0:
        return True

    return False