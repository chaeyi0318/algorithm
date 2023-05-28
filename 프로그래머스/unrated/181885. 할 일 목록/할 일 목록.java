import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer.add(todo_list[i]);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}