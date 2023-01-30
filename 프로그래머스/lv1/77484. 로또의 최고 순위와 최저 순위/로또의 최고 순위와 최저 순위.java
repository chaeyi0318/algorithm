class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int win = 0;
        int zero = 0;
        
        for(int i : lottos){
            if(i == 0){
                zero++;
            } else {
                for(int j : win_nums){
                if(i == j){
                    win++;
                    break;
                }
            }
            }
        }
        
        answer[0] = (win+zero) > 1 ? 7-(win+zero) : 6;
        answer[1] = win > 1 ? 7-win : 6;
        return answer;
    }
}