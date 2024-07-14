t = int(input())

for i in range(1, t + 1):
	p, q, r, s, w = map(int, input().split())
	a = p * w
	b = 0
    
	if w > r:
		b = q + (w - r) * s
	else:
		b = q
        
	print(f'#{i} {min(a, b)}')