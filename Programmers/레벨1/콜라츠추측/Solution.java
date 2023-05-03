package Programmers.레벨1.콜라츠추측;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        int count = 0;

        if(num == 1){
            return answer;
        }

        for(int i = 0; i < 500; i++){
            System.out.println(count);
            System.out.println(temp);
            if(temp == 1){
                break;
            }else if(temp % 2 == 0){
                temp /= 2;
                count++;
            }else{
                temp = (temp * 3) + 1;
                count++;
            }
        }

        if(temp == 1){
            answer = count;
        }else{
            answer = -1;
        }
    
        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(626331);
    }
}
