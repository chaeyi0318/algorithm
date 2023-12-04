class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = 0; j < numlist.length - 1; j++) {
                int num1 = Math.abs(n - numlist[j]);
                int num2 = Math.abs(n - numlist[j + 1]);

                if (num1 > num2) {
                    int tmp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = tmp;
                }
                if (num1 == num2 && numlist[j] < numlist[j + 1]) {
                    int tmp = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = tmp;
                }
            }
        }

        return numlist;
    }
}