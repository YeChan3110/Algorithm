package Programmers.레벨2.다음큰숫자;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = oneCount(n);
        
        for(int i = n + 1; i != 0; i++){
            if(oneCount(i) == nCount) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public int oneCount(int num){
        int oneCount = 0;
        String nBinary = Integer.toBinaryString(num);

        // for each문을 String으로 하니 효율성 통과가 안됐음. char로 변경하니 됨
        for(char c : nBinary.toCharArray()){
            if(String.valueOf(c).equals("1")) oneCount ++;
        }

        return oneCount;
    }

    public static void main(String[] args) {
        new Solution().solution(78);
    }
}
