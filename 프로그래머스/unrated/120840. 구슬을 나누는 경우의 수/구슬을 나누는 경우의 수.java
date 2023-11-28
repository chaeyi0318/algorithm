import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger b = BigInteger.valueOf(balls);
        BigInteger s = BigInteger.valueOf(share);

        return factorial(b).divide(factorial(b.subtract(s)).multiply(factorial(s)));
    }

    public static BigInteger factorial (BigInteger n) {
        if (n.intValue() <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}