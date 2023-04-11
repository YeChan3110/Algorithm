package Programmers.레벨0.잘라서배열로저장하기;

public class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() / n) + (my_str.length() % n == 0 ? 0 : 1)];
        // 문자열이 n개로 떨어지지 않을 때

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

        return answer;

    }
    public static void main(String[] args) {
        new Solution().solution("123456789", 3);
    }
}
