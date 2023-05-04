package Programmers.레벨1.삼3진법뒤집기;

public class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(String.valueOf(n%3));
            n /= 3;
        }
        
        return Integer.parseInt(sb.toString(),3);
    }
    public static void main(String[] args) {
        new Solution().solution(125);
    }
}
