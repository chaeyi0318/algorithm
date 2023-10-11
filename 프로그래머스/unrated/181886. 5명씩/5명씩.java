import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            answer.add(names[i]);
            i += 4;
        }
        
        return answer;
    }
}