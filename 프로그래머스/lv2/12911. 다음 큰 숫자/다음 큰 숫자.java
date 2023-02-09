class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int n_count = Integer.bitCount(n);
        int result_count = 0;
        
        while(true) {
            n++;
            result_count = Integer.bitCount(n);
            
            if(n_count == result_count) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}