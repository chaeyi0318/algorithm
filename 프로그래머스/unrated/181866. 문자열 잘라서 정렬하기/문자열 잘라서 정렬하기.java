import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List solution(String myString) {
        List<String> answer = new ArrayList<>();
        String[] strArr = myString.split("x");

        for (String str : strArr) {
            if (!str.isEmpty()) {
                answer.add(str);
            }
        }
        Collections.sort(answer);

        return answer;
    }
}