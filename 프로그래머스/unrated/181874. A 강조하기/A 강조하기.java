class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] str = myString.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("a") || str[i].equals("A")) {
                answer += str[i].toUpperCase();
            } else {
                answer += str[i].toLowerCase();
            }
        }
        
        return answer;
    }
}