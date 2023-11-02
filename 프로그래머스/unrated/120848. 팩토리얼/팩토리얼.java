class Solution {
    public int solution(int n) {
        int answer = 0;
        int fac = 1;

        for (int i = 1; i <= 10; i++) {
            fac *= i;

            if (fac == n) {
                answer = i;
                break;
            } else if (n < fac){
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}