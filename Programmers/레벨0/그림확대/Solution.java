package Programmers.레벨0.그림확대;

public class Solution {
    public String[] solution(String[] picture, int k) {
        int originalRows = picture.length;
        int originalCols = picture[0].length();
        int newRows = originalRows * k;
        int newCols = originalCols * k;
    
        String[] enlargedPicture = new String[newRows];
    
        for (int i = 0; i < newRows; i++) {
            StringBuilder row = new StringBuilder();
            int originalRowIdx = i / k;
    
            for (int j = 0; j < newCols; j++) {
                int originalColIdx = j / k;
                row.append(picture[originalRowIdx].charAt(originalColIdx));
            }
    
            enlargedPicture[i] = row.toString();
        }
    
        return enlargedPicture;
    }
    
}
