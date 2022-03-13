package assignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestWord {
    public static void findlargest(File file){
try {
    Scanner sc = new Scanner(file);
    ArrayList<String> arr = new ArrayList<>();

    while (sc.hasNextLine()) {
        String[] str = sc.nextLine().split(" ");
        Collections.addAll(arr, str);

    }
    String max = arr.get(0);
    for (String str : arr) {
        if (str.length() > max.length()) {
            max = str;
        }
    }
    System.out.println("laregst string in a given file is "+max);
}
catch (Exception e){
    System.out.println("exception is "+e);
}
    }
}