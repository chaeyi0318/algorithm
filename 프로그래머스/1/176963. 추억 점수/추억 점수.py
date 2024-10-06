def solution(name, yearning, photo):
    result = []
    info = dict(zip(name, yearning))
    
    for people in photo:
        s = 0
        
        for person in people:
            s += info.get(person, 0)
        result.append(s)
    
    return result