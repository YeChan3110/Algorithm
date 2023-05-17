package 백준.bronze.b5_9498_시험성적;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int i = Integer.parseInt(bf.readLine());
            if(i >= 90){
                bw.write("A");
                bw.flush();
            }else if(i >= 80){
                bw.write("B");
                bw.flush();
            }else if(i >= 70){
                bw.write("C");
                bw.flush();
            }else if(i >= 60){
                bw.write("D");
                bw.flush();
            }else{
                bw.write("F");
                bw.flush();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
