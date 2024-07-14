t = int(input())
days = {1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31}

for i in range(1, t + 1):
    string = str(input())
    answer = ""

    y = string[0:4]
    m = string[4:6]
    d = string[6:8]

    if 0 < int(m) < 13 and 0 < int(d) <= days[int(m)]:
        answer = y + '/' + m + '/' + d
    else:
        answer += '-1'
    print("#{} {}".format(i, answer))
