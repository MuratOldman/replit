package replitDesk;

import java.util.Arrays;

public class replit195_Methods_with_String_15_anagram {
    public static boolean isAnagram(String word1, String word2) {
      word1=word1.replaceAll(" ","").toUpperCase();
      word2=word2.replaceAll(" ","").toUpperCase();
      String[] w1=word1.split("");
      String[] w2=word2.split("");
      Arrays.sort(w1);
      Arrays.sort(w2);
      boolean b=Arrays.equals(w1,w2);

      return b;
    }


    public static void main(String[] args) {

    }


}
