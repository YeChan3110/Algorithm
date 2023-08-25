package 백준.별찍기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < i; j++){
                sb.append(" ");
            }
            for(int j = i; j < count; j++){
                sb.append("*");
            }
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
    }
}
