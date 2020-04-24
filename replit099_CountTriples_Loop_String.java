package replitDesk;

import java.util.Scanner;

public class replit099_CountTriples_Loop_String {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int count = 0 ;
            //WRITE YOUR CODE HERE
            int k=1;
            int m=2;
        for(int i=0; i<str.length()-2;i++){
           if((str.charAt(i)==str.charAt(k)&&str.charAt(i)==str.charAt(m))){
               count++;
            }
            k++;
            m++;
        }
            System.out.println(count);



    }
}
