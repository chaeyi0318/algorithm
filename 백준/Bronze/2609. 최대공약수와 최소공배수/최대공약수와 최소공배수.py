import math

N, M = map(int, input().split())

# 최대공약수
gcd = math.gcd(N, M)

# 최소공배수
lcm = (N * M) // gcd

print(gcd)
print(lcm)