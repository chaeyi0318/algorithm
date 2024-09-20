class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 1;
        char prevChar = s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (count == 0) {
                prevChar = currentChar;
                count++;
                continue;
            }
            
            if (prevChar == currentChar) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                answer++;
            }
        }

        if (count != 0) {
            answer++;
        }
                
        return answer;
    }
}