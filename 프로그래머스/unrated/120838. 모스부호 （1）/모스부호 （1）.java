class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] str = letter.split(" ");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (str[i].equals(morse[j])) {
                    answer += (char) ('a' + j);
                }
            }
        }
        
        return answer;
    }
}