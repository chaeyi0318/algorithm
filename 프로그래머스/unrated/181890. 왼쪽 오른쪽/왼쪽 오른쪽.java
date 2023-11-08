import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        List<String> str = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                str = List.of(Arrays.copyOfRange(str_list, 0, i));
                break;
            } else if (str_list[i].equals("r")) {
                str = List.of(Arrays.copyOfRange(str_list, i + 1, str_list.length));
                break;
            }
        }

        answer = str.toArray(new String[str.size()]);

        return answer;
    }
}