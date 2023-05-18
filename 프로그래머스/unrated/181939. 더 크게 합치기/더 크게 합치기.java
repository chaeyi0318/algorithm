class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = a + "";
        String b1 = b + "";
        
        if (Integer.parseInt(a1 + b1) > Integer.parseInt(b1 + a1)) {
            answer = Integer.parseInt(a1 + b1);
        } else {
            answer = Integer.parseInt(b1 + a1);
        }
        
        return answer;
    }
}