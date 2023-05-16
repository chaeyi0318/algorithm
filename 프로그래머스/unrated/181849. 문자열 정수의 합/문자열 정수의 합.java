class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        
        return answer;
    }
}