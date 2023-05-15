package Programmers.레벨1.kakao1차비밀지도;

import java.util.ArrayList;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = toMap(toBinaryMap(n, arr1),toBinaryMap(n, arr2),n);
        for(String str : answer){
            System.out.println(str);
        }
        return answer;
    }

    public ArrayList<String> toBinaryMap(int block, int[] array){
        ArrayList<String> map = new ArrayList<>();

        for(int i : array){
            StringBuilder sb = new StringBuilder();

            while(i > 0){
                int temp = i % 2;
                sb.insert(0, temp);
                i /= 2;
            }

            if(sb.length() < block){
                while(sb.length() < block){
                    sb.insert(0, "0");
                }
            }

            map.add(sb.toString());
        }

        return map;
    }

    public String[] toMap(ArrayList<String> map1, ArrayList<String> map2, int num){
        String[] merged = new String[map1.size()];        

        for(int i = 0; i < map1.size(); i ++){
            String temp1 = map1.get(i);
            String temp2 = map2.get(i);
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < num; j++){
                if(temp1.charAt(j) == '1' || temp2.charAt(j) == '1'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            merged[i] = sb.toString();
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        new Solution().solution(5, arr1, arr2);
    }
}
