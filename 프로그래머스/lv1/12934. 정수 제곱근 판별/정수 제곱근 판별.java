class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for (long i = 0; i * i <= n; i++) {
            answer = i * i == n ? (i + 1) * (i + 1) : -1;
        }
        return answer;
    }
}