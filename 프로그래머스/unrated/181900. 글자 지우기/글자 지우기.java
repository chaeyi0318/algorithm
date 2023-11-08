class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        String[] str = my_string.split("");

        for (int idx : indices) {
            str[idx] = "";
        }
        answer = String.join("", str);
        
        return answer;
    }
}