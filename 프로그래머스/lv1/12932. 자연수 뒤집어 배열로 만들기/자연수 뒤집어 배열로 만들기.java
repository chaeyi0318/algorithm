class Solution {
    public int[] solution(long n) {
        int count = 0;
        long num = n;
        
        while (num != 0) {
            num /= 10;
            count++;
        }
        
        int[] answer = new int[count];

        num = n;
        
        for (int i = 0; num != 0; i++) {
            answer[i] = (int) (num % 10);
            num /= 10;
        }
        return answer;
    }
}