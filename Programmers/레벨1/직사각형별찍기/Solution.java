package Programmers.레벨1.직사각형별찍기;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < a; i++){
            sb.append("*");
        }     
        for(int i = 0; i < b; i++){
            System.out.println(sb);
        }
    }
}
