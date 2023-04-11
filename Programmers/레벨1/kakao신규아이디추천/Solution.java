package Programmers.레벨1.kakao신규아이디추천;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String regex = "^[a-z0-9-_.]+$";

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
            new_id = new_id.toLowerCase();
        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
            for(char c : new_id.toCharArray()){
                if(String.valueOf(c).matches(regex)){
                    sb.append(c);
                }
            }
            new_id = sb.toString();
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
            new_id = new_id.replaceAll("\\.{2,}", ".");
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
            new_id = delDot(new_id);
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
            if(new_id.equals("") || new_id == null){
                new_id = "a";
            }
        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
            if(new_id.length() >= 16){
                new_id = new_id.substring(0, 15);
            }
            new_id = delDot(new_id);
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
            if(new_id.length() <= 2){
                sb.setLength(0);
                sb.append(new_id);
                for(int i = new_id.length(); i < 3; i++){
                    sb.append(new_id.charAt(new_id.length()-1));
                }
                answer = sb.toString();
            }else{
                answer = new_id;
            }

        return answer;
    }

    public String delDot(String str){
        if(!str.isEmpty() && str.charAt(0) == '.'){
            str = str.substring(1);
        }
        if(!str.isEmpty() && str.charAt(str.length() -1) == '.'){
            str = str.substring(0, str.length() -1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("new id : " + new Solution().solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println("new id : " + new Solution().solution("z-+.^."));
        System.out.println("new id : " + new Solution().solution("=.="));
        System.out.println("new id : " + new Solution().solution("123_.def"));
        System.out.println("new id : " + new Solution().solution("abcdefghijklmn.p"));
    }
}
