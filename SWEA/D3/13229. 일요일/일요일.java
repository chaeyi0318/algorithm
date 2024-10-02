import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
            String S = br.readLine();
            int result = 0;

            for (int i = 0; i < week.length; i++) {
                if (S.equals(week[i])) {
                    if (S.equals("SUN")) {
                        result = 7;
                    } else {
                        result = 7 - (i + 1);
                    }
                    break;
                }
            }
            bw.write("#" + t + " " + result);
            bw.newLine();
        }
        bw.close();
    }
}