package Programmers.피자나눠먹기2;

public class Solution {
    public int solution(int n) {
        return n % 6 == 0 ? n / 6 : lcm(n,6) / 6;
    }
    private int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
