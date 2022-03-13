package assignment;

import java.util.ArrayList;

public class PermutationString {
    public static void  permutationString(String str){

    ArrayList<StringBuilder> a=new ArrayList<>();

        for(int i=0;i<str.length();i++){
        StringBuilder sb=new StringBuilder(str.charAt(i));
        sb.append(str.charAt(i));
        for (int j=0;j<str.length();j++){
            if(i!=j){
                sb.append(str.charAt(j));
            }
        }
        a.add(sb);

        StringBuilder sb1=new StringBuilder(str.charAt(i));
        sb1.append(str.charAt(i));
        for (int j=str.length()-1;j>=0;j--){
            if(i!=j){
                sb1.append(str.charAt(j));
            }
        }
        a.add(sb1);
    }
        System.out.println(a);
}

}
