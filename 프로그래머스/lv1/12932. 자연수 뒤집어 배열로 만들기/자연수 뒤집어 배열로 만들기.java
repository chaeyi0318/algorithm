import java.util.*;

class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> arrayList = new ArrayList();

        while(n > 0) {
            arrayList.add((int) (n % 10));
            n /= 10;
        }
        return arrayList;
    }
}