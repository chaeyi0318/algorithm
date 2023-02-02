class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int ant1 = 5;
        int ant2 = 3;
        int ant3 = 1;
        
        while(hp != 0) {
            if(hp >= 5) {
                answer += hp / 5;
                hp %= 5;
            } else if(hp >= 3) {
                answer += hp / 3;
                hp %= 3;
            } else {
                answer += hp / 1;
                hp %= 1;
            }
        }
        return answer;
    }
}