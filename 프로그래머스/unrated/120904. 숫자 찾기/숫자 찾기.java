class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(Integer.toString(k))) {
                return answer = i + 1;
            }
        }
        return -1;
    }
}