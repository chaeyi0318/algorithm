N = int(input())

result = 0

for i in range(1, N + 1):
    sum_value = sum(map(int, str(i)))
    tmp = i + sum_value

    if tmp == N:
        result = i
        break
        
print(result)