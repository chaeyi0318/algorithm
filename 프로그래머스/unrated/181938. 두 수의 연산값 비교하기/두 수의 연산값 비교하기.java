class Solution {
    public int solution(int a, int b) {
        String str = a + "" + b;
        
        int answer = (int) Math.max(Integer.parseInt(str), (2 * a * b));
        
        return answer;
    }
}