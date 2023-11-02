import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;

        LocalDate lod1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate lod2 = LocalDate.of(date2[0], date2[1], date2[2]);

        if (lod2.isAfter(lod1) == true) {
            answer = 1;
        }
        return answer;
    }
}