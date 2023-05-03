package Programmers.레벨1.문자열내림차순의로배치하기;

public class Solution {
    public String solution(String s) {
        int[] ascii = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            ascii[i] = s.toCharArray()[i];
        }

        for (int i = ascii.length - 1; i >= 0; i--) {
            for (int j = ascii.length - 1; j > ascii.length - 1 - i; j--) {
                if (ascii[j] > ascii[j - 1]) {
                    int temp = ascii[j];
                    ascii[j] = ascii[j - 1];
                    ascii[j - 1] = temp;
                }
            }
        }
        
        for(int i : ascii){
            sb.append(String.valueOf((char)i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        new Solution().solution("Zbcdefg");
    }
}
