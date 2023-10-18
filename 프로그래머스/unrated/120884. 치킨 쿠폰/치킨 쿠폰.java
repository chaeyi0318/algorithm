class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int tmp = 0;
        int answer = 0;

        while (coupon > 9) {
            answer += coupon / 10;
            tmp = coupon % 10;
            coupon /= 10;
            coupon += tmp;
        }
        
        return answer;
    }
}