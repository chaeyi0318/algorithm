from bisect import bisect_left, bisect_right

N = int(input())
card = list(map(int, input().split()))
M = int(input())
number = list(map(int, input().split()))

card.sort()

for i in range(len(number)):
    right = bisect_right(card, number[i])
    left = bisect_left(card, number[i])

    print(right - left, end=' ')
