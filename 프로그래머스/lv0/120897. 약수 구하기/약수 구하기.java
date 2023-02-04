import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr.add(i);
            } else {
                continue;
            }
        }
        return arr;
    }
}