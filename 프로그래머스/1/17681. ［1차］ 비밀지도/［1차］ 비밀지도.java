import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String format = "%0" + n + "d";

        for (int i = 0; i < arr1.length; i++) {
            String arr1Str = String.format(format, Long.parseLong(Long.toBinaryString(arr1[i])));
            String arr2Str = String.format(format, Long.parseLong(Long.toBinaryString(arr2[i])));
            String tmp = "";

            for (int j = 0; j < arr1Str.length(); j++) {
                if (arr1Str.charAt(j) == '1' || arr2Str.charAt(j) == '1') {
                    tmp += "#";
                } else {
                    tmp += " ";
                }
                answer[i] = tmp;
            }
        }
        return answer;
    }
}