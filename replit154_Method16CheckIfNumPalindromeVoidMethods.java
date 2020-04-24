package replitDesk;



import java.util.Scanner;

public class replit154_Method16CheckIfNumPalindromeVoidMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String number=""+num;
        String revers="";
        for(int i=number.length()-1;i>=0;i--){
            revers+=""+number.charAt(i);
        }
        System.out.println(revers.equals(""+num));


    }


}
