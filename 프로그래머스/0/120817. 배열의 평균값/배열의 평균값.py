def solution(numbers):
    answer = 0
    
    for num in numbers:
        answer += num
    
    return answer / len(numbers)