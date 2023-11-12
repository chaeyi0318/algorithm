class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int tmp = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            tmp = Math.abs(n - array[i]);
            if (tmp < min) {
                min = tmp;
                answer = array[i];
                
            } else if (tmp == min && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}