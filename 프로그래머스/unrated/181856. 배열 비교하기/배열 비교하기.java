class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if (arr1.length == arr2.length) {
            int sumArr1 = 0;
            int sumArr2 = 0;

            for (int i = 0; i < arr1.length; i++) {
                sumArr1 += arr1[i];
                sumArr2 += arr2[i];
            }

            if (sumArr1 > sumArr2) {
                answer = 1;
            } else if (sumArr1 < sumArr2){
                answer = -1;
            } else if (sumArr1 == sumArr2){
                answer = 0;
            }
            System.out.println(answer);
        } else if(arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        }
        return answer;
    }
}