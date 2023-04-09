package Programmers.피자나눠먹기;

public class Solution {
    public int solution(int n) {
        return n % 7 == 0 ? n/7 : n/7 + 1;
        //return (n+6)/7;
    }
}
