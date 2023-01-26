class Solution {
    public int solution(int price) {
        float result = 0;
        
        if(price >= 500000) {
            result = price * 0.8f;
        } else if(price >= 300000) {
            result = price * 0.9f;
        } else if(price >= 100000) {
            result = price * 0.95f;
        } else {
            result = price;
        }
        return (int) result;
    }
}