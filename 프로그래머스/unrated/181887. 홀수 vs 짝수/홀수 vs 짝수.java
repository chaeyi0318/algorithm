class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }
        
        answer = (int) Math.max(odd, even);
        
        return answer;
    }
}