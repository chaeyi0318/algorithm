class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i = 0; i <= Math.sqrt(n); i++) {
            answer = i == Math.sqrt(n) ? (long) Math.pow(i + 1, 2) : -1;
        }
        return answer;
    }
}