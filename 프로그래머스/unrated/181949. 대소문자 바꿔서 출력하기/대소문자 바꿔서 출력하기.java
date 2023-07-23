import java.util.Scanner;
import java.util.*;

public class Solution {
    
    private static String rawString = "";
    private static ArrayList<Character> rawArr = new ArrayList<Character>();
    private static String answer = "";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        rawString = a;
        for (int i = 0; i < a.length(); i++) {
            rawArr.add(rawString.charAt(i));
            //System.out.println(rawArr.get(i)); // 배열에 한문자씩 담음
        }
        
        for (int i = 0; i < rawArr.size(); i++) {
            if (Character.isUpperCase(rawArr.get(i))) {
                char temp = Character.toLowerCase(rawArr.get(i));
                answer += temp;
            } else {
                char temp = Character.toUpperCase(rawArr.get(i));
                answer += temp;
            }
        }
        
        System.out.println(answer);
    }
    
}
