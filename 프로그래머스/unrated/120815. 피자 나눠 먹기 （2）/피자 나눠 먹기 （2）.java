class Solution {
    public int solution(int n) {
        int answer = 6;

        while(answer % n != 0) {
            answer += 6;
        }

        return answer /= 6 ;
    }
}