package Programmers.옷가게할인받기;

public class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000 && price < 300000){
            answer = pay(price,0.95);
        }
        if(price >= 300000 && price < 500000){
            answer = pay(price,0.90);
        }
        if(price >= 500000){
            answer = pay(price,0.80);
        }
        return answer;
    }

    private int pay(int price, double rate){
        int pay = (int)(price * rate);
        return pay - (pay % 10);
    }
}
