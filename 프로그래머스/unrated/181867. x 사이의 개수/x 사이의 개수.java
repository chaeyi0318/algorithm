import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] str = myString.split("x", -1);

        for (int i = 0; i < str.length; i++) {
            answer.add(str[i].length());
        }

        return answer;
    }
}