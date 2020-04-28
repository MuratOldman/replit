package replitDesk;

import java.util.Scanner;

public class Assessment_test_5_1_Print_vowels {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String vowels="aeiou";
        word=word.toLowerCase();
        String result="";
        for(int i=0;i<word.length();i++){
            if(vowels.contains(""+word.charAt(i))){
                result+=""+word.charAt(i);
            }
        }

        System.out.println(result);

    }

}
