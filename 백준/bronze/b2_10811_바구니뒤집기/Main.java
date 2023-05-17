package 백준.bronze.b2_10811_바구니뒤집기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];

        for(int i = 0; i < n; i++){
            basket[i] = i + 1;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;

            for(int j = startIndex; j < endIndex; j++, endIndex--){
                int temp = basket[j];
                basket[j] = basket[endIndex];
                basket[endIndex] = temp;
            }

        }
        for(int b : basket){
            System.out.print(b + " "); 
        }
    }
}
