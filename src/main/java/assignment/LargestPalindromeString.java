package assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestPalindromeString {
    public static boolean isPalindrome(String str) {
        StringBuilder sb= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
            sb.append(str.charAt(i));
        return sb.toString().equals(str);
    }

    public static String largest(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)) {
                boolean check = isPalindrome(str.substring(map.get(ch), i + 1));

                if (check) arr.add(str.substring(map.get(ch), i + 1));
            }
                else map.put(str.charAt(i),i);
        }
        String largest=arr.get(0);
        for (String string:arr) {
            if(string.length()>largest.length()){
                largest=string;
            }
        }
        return "largest palindrome substring is " +largest + " " + " and length is "+largest.length();

    }



}
