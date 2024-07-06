def solution(price):
    answer = 0
    
    if 500000 <= price:
        answer = int(price * 0.8)
    elif 300000 <= price:
        answer = int(price * 0.9)
    elif 100000 <= price:
        answer = int(price * 0.95)
    else:
        answer = price
    
    return answer