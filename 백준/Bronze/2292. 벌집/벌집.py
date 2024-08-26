N = int(input())

num = 1
cnt = 1

while N > num:
    num += 6 * cnt
    cnt += 1
    
print(cnt)