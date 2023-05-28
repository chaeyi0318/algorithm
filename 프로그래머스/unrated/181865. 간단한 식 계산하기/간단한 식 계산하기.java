class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        
        if (strArr[1].equals("+")) {
            answer = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
        } else if (strArr[1].equals("-")) {
            answer = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
        } else {
            answer = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
        }
        
        return answer;
    }
}