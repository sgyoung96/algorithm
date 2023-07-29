import java.util.*;

class Solution {
    
    private ArrayList<String> words = new ArrayList<String>();
    private String compare = "";
    private int count = 0;
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String word : babbling) {
            words.add(word);
        }
        
       for (String word : words) {
           compare = word;
           
           while(compare.contains("aya") || compare.contains("ye") || compare.contains("woo") || compare.contains("ma")) {
               
               if (compare.contains("aya")) {
                   compare = compare.replaceFirst("aya", ":");
               }
               
               if (compare.contains("ye")) {
                   compare = compare.replaceFirst("ye", ":");
               }
               
               if (compare.contains("woo")) {
                   compare = compare.replaceFirst("woo", ":");
               }
               
               if (compare.contains("ma")) {
                   compare = compare.replaceFirst("ma", ":");
               }
               
               String temp = compare.replace(":", "");
               if (temp.equals("")) {
                   count++;
               }
           }
       }
        
        System.out.println(count);
        
        answer = count;
        return answer;
    }
    
}