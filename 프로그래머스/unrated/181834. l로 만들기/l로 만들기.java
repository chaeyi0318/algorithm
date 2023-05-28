class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] chArr = myString.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] < 'l') {
                answer += "l";
            } else {
                answer += chArr[i];
            }
        }
        
        return answer;
    }
}