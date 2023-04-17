package Programmers.레벨0.공던지기;

public class Solution {
    public int solution(int[] numbers, int k) {
        int[] newArr = new int[numbers.length / 2];
        int idx = k % 2;
    
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = numbers[i*2 + idx];
        }
    
        return newArr[k/2];
    }
    // int count = 0;
    // int idx = 0;
    //     while(true){
    //         boolean a = numbers[numbers.length-1] == numbers[idx];
    //         boolean b = numbers[numbers.length-2] == numbers[idx];
    //         System.out.println("i : " + idx);
    //         if(count == k-2) break;

    //         if(a){
    //             idx = 1;
    //         }

    //         if(b){
    //             idx = 0;
    //         }    

    //         if(!a && !b){
    //             answer = numbers[idx+2];
    //             idx += 2;
    //         }

    //         count ++;
    //     }
    //     System.out.println(answer);
    //     return answer;
    // }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        new Solution().solution(a, 5);
    }
}
