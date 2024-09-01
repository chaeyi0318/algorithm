import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    cnt = 0

    while 1 < len(scoville) and scoville[0] < K:
        s0 = heapq.heappop(scoville)
        s1 = heapq.heappop(scoville)
        tmp = s0 + (s1 * 2)
        heapq.heappush(scoville, tmp)
        cnt += 1

    if scoville[0] < K:
        return -1

    return cnt