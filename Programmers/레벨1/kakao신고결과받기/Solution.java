package Programmers.레벨1.kakao신고결과받기;

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {    
        int[] answer = new int[id_list.length];

        Map<String, String> reportUser = new HashMap<>();
        Map<String, Integer> reportTimes = new HashMap<>();
        Map<String, Integer> receiver = new HashMap<>();

        for(int i = 0; i < report.length; i ++){
            int separate = report[i].indexOf(" ");
            String user = report[i].substring(0, separate);
            String reported = report[i].substring(separate + 1, report[i].length());

            // 신고자, 신고한 ID
            if(reportUser.get(user) == null){
                reportUser.put(user,reported);
            }else{
                if(reportUser.get(user).contains(reported)){
                    continue;
                }else{
                    reportUser.put(user,reportUser.get(user) + " " + reported);
                }
            }

            // 신고받은 ID, 신고 횟수
            reportTimes.put(reported, reportTimes.getOrDefault(reported, 0) + 1);
        }

        for(String id : id_list){
            if(reportTimes.get(id) == null){
                continue;
            }

            if(reportTimes.get(id) >= k){

                for(int i = 0; i < reportUser.size(); i ++){
                    String user = report[i].substring(0, report[i].indexOf(" "));
                    if(reportUser.get(user).contains(id)){
                        receiver.put(user, receiver.getOrDefault(user, 0) + 1);
                    }
                }
            }

        }

        for(int i = 0; i < id_list.length; i ++){
            answer[i] = receiver.getOrDefault(id_list[i], 0);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        new Solution().solution(id_list, report, k);
    }
}
