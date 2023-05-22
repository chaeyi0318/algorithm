class Solution {
    public int solution(int[] box, int n) {
        int w = box[0] / n;
        int h = box[1] / n;
        int d = box[2] / n;
        
        int answer = w * h * d;
        
        return answer;
    }
}