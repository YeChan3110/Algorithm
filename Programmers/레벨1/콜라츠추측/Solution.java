package Programmers.레벨1.콜라츠추측;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        // 홀수 > 짝수 > 홀수 > 짝수 형태를 반복하면 int형이라서 오버플로우가 발생
        // long으로 함함
        long temp = num;
        int count = 0;

        if(num == 1){
            return answer;
        }

        for(int i = 0; i < 500; i++){
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
