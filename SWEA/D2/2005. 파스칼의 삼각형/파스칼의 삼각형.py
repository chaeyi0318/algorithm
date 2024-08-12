# 재귀함수
T = int(input())

def pascal_triangle(i, j):
    if i == j or j == 0:
        return 1
    return pascal_triangle(i - 1, j - 1) + pascal_triangle(i - 1, j)

for t in range(1, 1 + T):
    N = int(input())
    triangle = []

    for i in range(N):
        row = []
        for j in range(i + 1):
            row.append(pascal_triangle(i, j))
        triangle.append(row)

    print(f'#{t}')
    
    for i in range(len(triangle)):
        print(*triangle[i])