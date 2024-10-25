import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] queue = new int[2000000];
        int front = 0, back = 0, size = 0;
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            
            switch(c) {
                case 'p':
                    if (command.charAt(1) == 'u') {
                        queue[back++] = Integer.parseInt(command.substring(5));
                        size++;
                    } else {
                        if (size == 0) {
                            bw.write("-1\n");
                        } else {
                            bw.write(queue[front++] + "\n");
                            size--;
                        }
                    }
                    break;
                case 's':
                    bw.write(size + "\n");
                    break;
                case 'e':
                    bw.write((size == 0 ? 1 : 0) + "\n");
                    break;
                case 'f':
                    bw.write((size == 0 ? -1 : queue[front]) + "\n");
                    break;
                case 'b':
                    bw.write((size == 0 ? -1 : queue[back - 1]) + "\n");
                    break;
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}