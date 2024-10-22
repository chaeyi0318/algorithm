def solution(n, words):
    answer = [0, 0]

    for idx, word in enumerate(words):
        if idx < 1:
            pass
        else:
            if (word in words[:idx]) or (word[0] != words[idx-1][-1]):
                answer[0] = (idx % n) + 1
                answer[1] = (idx // n) + 1
                break
    return answer