import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        int[] student = new int[n];
        Arrays.fill(student, 1);
        
        for (int i = 0; i < lost.length; i++) {
            student[lost[i] - 1] -= 1;
        }
        
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i] - 1] += 1;
        }
        
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 2) {
                if (i - 1 >= 0 && student[i - 1] == 0) {
                    student[i - 1] = 1;
                    student[i] = 1;
                } else if (i + 1 < student.length && student[i + 1] == 0) {
                    student[i + 1] = 1;
                    student[i] = 1;
                }
            }
        }
        
        for (int i = 0; i < student.length; i++) {
            if (student[i] > 0) {
                result++;
            }
        }
        
        return result;
    }
}