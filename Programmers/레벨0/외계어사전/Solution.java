package Programmers.레벨0.외계어사전;

public class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;

        for(int i = 0; i < dic.length; i++){
            int count = dic[i].length();
            int spcnt = count;

            for(int j = 0; j < spell.length; j++){
                if(!dic[i].contains(spell[j])){
                    spcnt--;
                }
            }

            if(count == spcnt){
                return 1;
            }
        }

        answer = 2;

        return answer;
    }
}
