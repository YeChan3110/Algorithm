package Programmers.잘라서배열로저장하기;

public class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()/n)+1];
        
        int idx = 0;
        int num = n;
        for(int i = 0; i < my_str.length() / n; i++){
            if(my_str.length() >= n){
                answer[i] = my_str.substring(idx, num);
                idx += n;
                num += n;
                if(num == n){
                    break;
                }
            }
        }
        if(my_str.length() % n != 0){
            answer[answer.length-1] = my_str.substring(idx);
        }
        // for(int i = 0 ; i < answer.length; i++){
        //     System.out.println(answer[i]);
        // }
        return answer;

    }
    public static void main(String[] args) {
        new Solution().solution("123456789", 3);
    }
}
