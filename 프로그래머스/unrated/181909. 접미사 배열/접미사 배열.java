import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List solution(String my_string) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i));
        }

        Collections.sort(answer);

        return answer;
    }
}