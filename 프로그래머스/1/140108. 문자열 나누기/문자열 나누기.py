def solution(s):
    j = 0 
    cnt = 0 
    ans = 0
    for idx, i in enumerate(s): 
        cnt += 1 if s[j] == i else - 1 
        if cnt == 0 : 
            ans += 1 
            j = idx + 1 
    return ans + 1 if cnt else ans