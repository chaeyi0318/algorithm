import math

n = int(input())

sizes = map(int, input().split())

t, p = map(int, input().split())

shirts_set_count = 0

for size in sizes:
    if size > 0:
        shirts_set_count += math.ceil(size / t)

print(shirts_set_count)
print(n // p, n % p)