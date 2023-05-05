package Programmers.레벨1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                if(sizes[i][0] > width){
                    width = sizes[i][0];
                }
                if(sizes[i][1] > height){
                    height = sizes[i][1];
                }
            }else{
                if(sizes[i][1] > width){
                    width = sizes[i][1];
                }
                if(sizes[i][0] > height){
                    height = sizes[i][0];
                }
            }
        }

        return width * height;
    }
    public static void main(String[] args) {
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        new Solution().solution(sizes);
    }
}
