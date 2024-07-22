def solution(strArr):
    answer = []

    for i in range(len(strArr)):
        print(strArr[i])
        if i % 2 != 0:
            answer.append(strArr[i].upper())
        else:
            answer.append(strArr[i].lower())

    return answer