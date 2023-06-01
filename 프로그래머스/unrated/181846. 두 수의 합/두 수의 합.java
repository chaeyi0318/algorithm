import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        String answer = String.valueOf(num1.add(num2));
        
        return answer;
    }
}