package Programmers.레벨0.글자지우기;

public class Solution {
    public String solution(String my_string, int[] indices) {
        String[] str = my_string.split("");
        StringBuilder sb = new StringBuilder();

        for(int idx : indices){
            str[idx] = "";
        }

        for(String s : str){
            sb.append(s);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1,16,6,15,0,10,11,3};
        new Solution().solution(my_string,indices);
    }
}
