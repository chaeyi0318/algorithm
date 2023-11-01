class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str += "B";
            } else {
                str += "A";
            }
        }

        if (str.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}