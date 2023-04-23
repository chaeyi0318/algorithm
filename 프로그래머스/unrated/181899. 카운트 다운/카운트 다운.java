class Solution {
    public int[] solution(int start, int end) {
        int length = (start - end) + 1;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = start - i;
        }
        
        return answer;
    }
}