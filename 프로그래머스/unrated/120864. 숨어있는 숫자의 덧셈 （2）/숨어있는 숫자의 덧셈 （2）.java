import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string);

        while (matcher.find()) {
            answer += Integer.parseInt(matcher.group());
        }

        return answer;
    }
}