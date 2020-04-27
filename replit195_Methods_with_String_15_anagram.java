package replitDesk;

import java.util.Arrays;

public class replit195_Methods_with_String_15_anagram {
    public static boolean isAnagram(String word1, String word2) {

        word1=word1.replaceAll(" ","").toLowerCase();
        word2=word2.replaceAll(" ","").toLowerCase();
        String[]w1=word1.split("");
        String[]w2=word2.split("");
        Arrays.sort(w1);
        Arrays.sort(w2);
       boolean b=w1.equals(w2);



        return b;

    }


    public static void main(String[] args) {


        String[]arr1={"a", "c", "e", "i", "m", "n"};
        String[]arr2={"a", "c", "e", "i", "m", "n"};
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr1[0]==arr2[0]);
        System.out.println((arr1[0].equals(arr2[0])));
    }


}
