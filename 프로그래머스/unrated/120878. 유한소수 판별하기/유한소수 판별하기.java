class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int B = b / GCD(a, b);

        while (B != 1) {
            if (B % 2 == 0) {
                B /= 2;
            } else if (B % 5 == 0) {
                B /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}