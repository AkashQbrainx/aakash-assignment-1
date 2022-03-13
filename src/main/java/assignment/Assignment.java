package assignment;

import java.io.File;
import java.util.HashMap;

public class Assignment {
    public static void main(String[] args) {

        String str="theehtquickbrownfoxxofnworbquickkciuq";
        System.out.println(LargestPalindromeString.largest(str));

        File file = new File("C:\\Users\\AAkash\\Desktop\\sample_project\\src\\main\\resources\\file.txt");
        LargestWord.findlargest(file);

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,18);
        map.put(2,20);
        map.put(3,45);
        map.put(4,8);
        map.put(5,6);
        GreatestKeyAndLeastKey.greatest(map);

      PermutationString.permutationString("ABC");

    }
}
