def solution(array): 
    array.sort()
    
    idx = (len(array) // 2)
    
    return array[idx]