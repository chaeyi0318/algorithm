class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double result = 0;
        
        for(int i = 0; i < numbers.length; i ++) {
            result += numbers[i];
        }
        
        answer = result / numbers.length;
        
        return answer;
    }
}