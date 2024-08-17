def check(tmp):
    for i in range(5):
        if bingo[i] == [0] * 5:
            tmp += 1
            
    for i in range(5):
        if all(bingo[j][i] == 0 for j in range(5)):
            tmp += 1
            
    if all(bingo[i][i] == 0 for i in range(5)):
        tmp += 1

    if all(bingo[i][4 - i] == 0 for i in range(5)):
        tmp += 1
    return tmp

bingo = [list(map(int, input().split())) for _ in range(5)]
speak = []
for _ in range(5):
    speak += list(map(int, input().split()))
cnt = 0
tmp = 0
for i in range(25):
    for x in range(5):
        for y in range(5):
            if speak[i] == bingo[x][y]:
                bingo[x][y] = 0
                cnt += 1
    if cnt >= 12:
        result = check(tmp)
        if result >= 3:
            print(i + 1)
            break