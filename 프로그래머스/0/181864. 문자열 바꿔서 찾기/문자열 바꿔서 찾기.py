def solution(myString, pat):
    tmp_list = []
    for str in myString:
        if str == 'A':
            tmp_list.append('B')
        else:
            tmp_list.append('A')

    result = ''.join(tmp_list)

    if pat in result:
        return 1
    else:
        return 0