def solution(s):
    tmp = list(map(int, s.split(' ')))
    
    return f'{min(tmp)} {max(tmp)}'