import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max = arr[0];
        int min = arr[0];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        return min + " " + max;
    }
}