from collections import deque

def check_str(parens):
    parens_dict = {
        ']': '[',
        '}': '{',
        ')': '('
    }

    stack = []

    for ch in parens:
        if ch in parens_dict.values():
            stack.append(ch)
        elif ch in parens_dict.keys():
            if not stack or stack[-1] != parens_dict[ch]:
                return 0
            stack.pop()

    return 1 if not stack else 0


def solution(s):
    parens = deque(s)
    answer = 0

    for _ in range(len(parens)):
        if check_str(parens):
            answer += 1

        parens.append(parens.popleft())

    return answer