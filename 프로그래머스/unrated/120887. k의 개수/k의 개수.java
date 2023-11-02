class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            if (String.valueOf(l).contains(String.valueOf(k))) {
                String[] strArr = String.valueOf(l).split("");

                for (String str : strArr) {
                    if (str.equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}