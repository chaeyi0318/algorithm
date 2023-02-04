class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                answer += String.valueOf(ch[i]).toUpperCase();
            } else {
                answer += String.valueOf(ch[i]).toLowerCase();
            }
        }
        return answer;
    }
}