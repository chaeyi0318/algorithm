class Solution {
    public int solution(String before, String after) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < before.length(); i++) {
            sum1 += before.charAt(i);
            sum2 += after.charAt(i);
        }
        return (sum1 == sum2)? 1 : 0;
    }
}