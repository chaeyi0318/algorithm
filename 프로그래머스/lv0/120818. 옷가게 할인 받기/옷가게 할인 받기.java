class Solution {
    public int solution(int price) {
        int discount = price / 10000;
        float result = 0;
        
        if(discount >= 50) {
            result = price * 0.8f;
        } else if(discount >= 30) {
            result = price * 0.9f;
        } else if(discount >= 10) {
            result = price * 0.95f;
        } else {
            result = price;
        }
        return (int) result;
    }
}