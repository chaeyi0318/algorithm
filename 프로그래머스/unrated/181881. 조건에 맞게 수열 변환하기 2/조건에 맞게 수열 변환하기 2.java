import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] tmp = arr.clone();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (tmp[j] >= 50 && tmp[j] % 2 == 0) {
                    tmp[j] /= 2;
                } else if (tmp[j] < 50 && tmp[j] % 2 != 0) {
                    tmp[j] = (tmp[j] * 2) + 1;
                }
            }
            count++;

            if (Arrays.equals(arr, tmp)) {
                answer = count - 1;
                break;
            } else {
                arr = tmp.clone();
            }
        }
        return answer;
    }
}