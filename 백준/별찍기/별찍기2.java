package 백준.별찍기;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class 별찍기2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            sb.append(" ");
        }

        for(int i = count - 1; i > -1; i--){
            sb.setCharAt(i, '*');
            System.out.println(sb.toString());
        }
        
    }
    
}
