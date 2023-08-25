package 백준.별찍기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        br.close();
        int star = 1;
        int blank = count - 1;

        for (int i = 0; i < count; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < blank; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < star; j++) {
                sb.append("*");
            }

            bw.write(sb.toString() + "\n");

            blank -= 1;
            star += 2;
        }

        bw.flush();
        bw.close();
    }

    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringBuilder sb = new StringBuilder();
    //     int count = Integer.parseInt(br.readLine());

    //     for(int i = 0; i < count; i++){
    //         sb.append(" ");
    //     }
    //     for(int i = count - 1; i > -1; i--){
    //         sb.replace(i, i, "*");
    //         System.out.println(sb.toString());
    //     }
        
    // }
}
