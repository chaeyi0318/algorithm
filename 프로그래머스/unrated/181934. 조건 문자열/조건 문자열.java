class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(60 == ineq.charAt(0)){
            if(63 != eq.charAt(0))
                return n <= m ? 1 : 0;
            else
                return n < m ? 0 : 1;
        } else {
            if(63 != eq.charAt(0))
                return n >= m ? 1 : 0;
            else
                return n > m ? 0 : 1;
        }
    }
}