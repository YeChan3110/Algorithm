package Programmers.레벨0.글자지우기;

public class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i = 0; i < my_string.length(); i++){
            System.out.println(str[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1,16,6,15,0,10,11,3};
        new Solution().solution(my_string,indices);
    }
}
