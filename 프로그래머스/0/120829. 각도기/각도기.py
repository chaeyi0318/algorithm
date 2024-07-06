def solution(angle):
    answer = 0
    
    if angle > 90 and 180 > angle:
        answer = 3
    elif angle == 90:
        answer = 2
    elif angle < 90:
        answer = 1
    else:
        answer = 4
    
    return answer