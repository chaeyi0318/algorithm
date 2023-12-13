class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] strs = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            for (String s : strs) {
                b = b.replace(s, "#");
            }

            if (b.replaceAll("#", "").equals("")) {
                answer++;
            }
        }

        return answer;
    }
}