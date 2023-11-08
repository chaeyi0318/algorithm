class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(tmp);
        String reverse = sb.reverse().toString();

        answer = my_string.replaceAll(tmp, reverse);

        return answer;
    }
}