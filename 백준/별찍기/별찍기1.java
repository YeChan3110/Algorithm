package 백준.별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < a; i++){
            sb.append("*");
            System.out.println(sb.toString());
        }
    }
}
