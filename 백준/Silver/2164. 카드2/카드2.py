from collections import deque

N = int(input())
result = deque()

for i in range(1, N + 1):
    result.append(i)

while len(result) != 1:
    result.popleft()
    result.append(result.popleft())

print(*result)