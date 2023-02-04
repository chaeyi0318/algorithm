class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");

        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("p")) {
                pCount++;
            } else if (str[i].equalsIgnoreCase("y")) {
                yCount++;
            }
        }
        return answer = pCount == yCount ? true : false;
    }
}