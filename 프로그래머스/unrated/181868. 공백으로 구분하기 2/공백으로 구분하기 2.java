import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")) {
                strList.add(temp[i]);
            }
        }
        String[] answer = strList.toArray(new String[0]);
        return answer;
    }
}