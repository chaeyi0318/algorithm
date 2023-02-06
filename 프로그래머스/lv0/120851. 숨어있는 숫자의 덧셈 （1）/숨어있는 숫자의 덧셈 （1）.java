class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] ch = my_string.toCharArray();

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                answer += Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return answer;
    }
}