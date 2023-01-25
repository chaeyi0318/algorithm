class Solution {
    public int solution(int n, int k) {
        int total = 0;
        
        int free = n / 10;
        
        total = (n * 12000) + ((k - free) * 2000);
        
        return total;
    }
}