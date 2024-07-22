str = input()

cnt = 0
for s in str:
    if s == 'a' or s == 'e' or s == 'i' or s == 'o'or s == 'u':
        cnt += 1
print(cnt)