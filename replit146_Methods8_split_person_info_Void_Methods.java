package replitDesk;

import java.util.Scanner;

public class replit146_Methods8_split_person_info_Void_Methods {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here
        String[] s=info.split(",");
        System.out.println("person name: "+s[0]+" last name: "+s[1]+" age: "+s[2]);

    }//end person


















}
