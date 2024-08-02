T = int(input())

for tc in range(1, T + 1):
    result = ''
    data = input()
    DATA_SIZE = len(data)

    for i in range(DATA_SIZE - 1, -1, -1):
        if data[i] == 'b': result += 'd'
        elif data[i] == 'd': result += 'b'
        elif data[i] == 'p': result += 'q'
        elif data[i] == 'q': result += 'p'

    print(f'#{tc} {result}')