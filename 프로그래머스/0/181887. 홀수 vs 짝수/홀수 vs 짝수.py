def solution(num_list):
    answer = 0
    tmp = 0
    
    for i in range(len(num_list)):
        if (i + 1) % 2 != 0:
            tmp += num_list[i]
        else:
            answer += num_list[i]
            
    answer = max(tmp, answer)
    
    return answer