package Programmers.레벨1.푸드파이트대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                sb.append(i);
            }
        }

        sb.append(0);

        for(int i = sb.length() - 2; i >= 0 ; i--){
            sb.append(sb.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        new Solution().solution(food);
    }
}
