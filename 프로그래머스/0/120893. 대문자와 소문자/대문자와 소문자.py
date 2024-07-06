def solution(my_string):
    answer = ''
    
    for str in my_string:
        if str.isupper():
            answer += str.lower()
        else:
            answer += str.upper()
    
    return answer