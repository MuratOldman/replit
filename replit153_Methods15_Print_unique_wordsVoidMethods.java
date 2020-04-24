package replitDesk;

import java.util.Scanner;

public class replit153_Methods15_Print_unique_wordsVoidMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        int count=0;
        for(int i=0;i<words.length;i++){
            count=0;
            for(int j=0;j<words.length;j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[i]);
            }
        }

    }

}
