class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orders = String.valueOf(order);
        
        for (int i = 0; i < orders.length(); i++) {
            if(orders.charAt(i) == '0') {
                continue;
            } else if ((orders.charAt(i) - '0') % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}