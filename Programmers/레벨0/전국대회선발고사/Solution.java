package Programmers.레벨0.전국대회선발고사;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] arr = new int[3];
        int count = 0;

        for(int i = 1; i < rank.length + 1; i++){
            if(count == 3) break;

            for(int j = 0; j < rank.length; j++){
                if(rank[j] == i && attendance[j] == true){
                    arr[count] = j;
                    count ++;
                }
            }
        }

        answer = (10000 * arr[0]) + (100 * arr[1] + arr[2]);

        return answer;
    }
}
