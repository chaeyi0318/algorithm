class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] str = code.split("");

        for (int i = 0; i < str.length; i++) {
            if (i % q == r) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}