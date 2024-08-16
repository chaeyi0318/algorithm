N = int(input())
arr = list(map(int, input().split()))

def find_longest_sequence(arr):
    inc_cnt = dec_cnt = 1
    max_cnt = 1

    for i in range(1, len(arr)):
        if arr[i] > arr[i - 1]:
            inc_cnt += 1
            dec_cnt = 1  # 감소 수열 초기화
        elif arr[i] < arr[i - 1]:
            dec_cnt += 1
            inc_cnt = 1  # 증가 수열 초기화
        else:
            inc_cnt += 1
            dec_cnt += 1
        
        max_cnt = max(max_cnt, inc_cnt, dec_cnt)
    
    return max_cnt

print(find_longest_sequence(arr))