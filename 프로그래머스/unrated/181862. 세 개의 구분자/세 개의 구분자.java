import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String myStr) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);

            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (sb.length() != 0) {
                    answer.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(ch);
            }
        }

        if (sb.length() > 0) {
            answer.add(sb.toString());
        }

        if (answer.size() == 0) {
            answer.add("EMPTY");
        }

        return answer;
    }
}