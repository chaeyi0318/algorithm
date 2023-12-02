class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split(" ");

            int num1 = Integer.parseInt(tmp[0]);
            int num2 = Integer.parseInt(tmp[2]);
            int result = Integer.parseInt(tmp[4]);

            if (tmp[1].equals("+")) {
                if (num1 + num2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (num1 - num2 == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}