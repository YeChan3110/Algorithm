package Programmers.레벨0.소인수분해;

import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int n) throws IOException{
        HashSet<Integer> set = new HashSet<>();

        for(int i = 2; i <= n; i++){
            while(n % i == 0){
                set.add(i);
                n /= i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        // set은 순서가 없으므로 정렬해주어야 함
        for(int i = 0; i < answer.length; i++){
            for(int j = i + 1; j < answer.length; j++){
                if(answer[j] < answer[i]){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new Solution().solution(Integer.parseInt(br.readLine()));
    }
}
