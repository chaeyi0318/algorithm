class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for (long i = 0; i * i <= n; i++) {
            if(i * i == n) {
                answer = (i + 1) * (i + 1);
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}