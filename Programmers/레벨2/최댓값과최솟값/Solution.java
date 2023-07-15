package Programmers.레벨2.최댓값과최솟값;

public class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min,max;
        min = max = Integer.parseInt(arr[0]);

        for(String a : arr){
            int temp = Integer.parseInt(a);

            if(temp < min){
                min = temp;
            }

            if(temp > max){
                max = temp;
            }
            
        }
        
        StringBuilder sb = new StringBuilder();

        sb.append(min);
        sb.append(" ");
        sb.append(max);

        return sb.toString();
        //return min + " " + max;
    }

    public static void main(String[] args) {
        new Solution().solution("1 4 5");
    }
}
