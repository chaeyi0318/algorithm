class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int x = 0;
        int num = 0;

        for (String str : arr) {
            if (str.contains("x")) {
                x += str.length() == 1 ? 1 : Integer.parseInt(str.replace("x", ""));
            } else {
                num += Integer.parseInt(str);
            }
        }

        if (x == 0) {
            answer = String.valueOf(num);
        } else {
            if (x == 1) {
                if (num == 0) {
                    answer = "x";
                } else {
                    answer = "x" + " + " + num;
                }
            } else {
                if (num == 0) {
                    answer = x + "x";
                } else {
                    answer = x + "x" + " + " + num;
                }
            }
        }
        return answer;
    }
}