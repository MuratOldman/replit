package replitDesk;

import java.util.Scanner;

public class replit076_Build_route_String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();


        if(start.equals(end)){
            System.out.print(end+" found");
        }
        else if(start.equals("A")){
            System.out.print("right");
            if(end.equals("B")){
                System.out.print(": B found");
                System.exit(0);
            }
            System.out.print(" > down");
            if(end.equals("C")){
                System.out.print(": C found");
                System.exit(0);
            }
            System.out.print(" > left");
            if(end.equals("D")){
                System.out.print(": D found");
                System.exit(0);
            }
        }
        else if(start.equals("B")){
            System.out.print("down");
            if(end.equals("C")){
                System.out.print(": C found");
                System.exit(0);
            }
            System.out.print(" > left");
            if(end.equals("D")){
                System.out.print(": D found");
                System.exit(0);
            }
            System.out.print(" > up");
            if(end.equals("A")){
                System.out.print(": A found");
                System.exit(0);
            }
        }
        else if(start.equals("C")) {
            System.out.print("left");
            if (end.equals("D")) {
                System.out.print(": D found");
                System.exit(0);
            }
            System.out.print(" > up");
            if(end.equals("A")){
                System.out.print(": A found");
                System.exit(0);
            }
            System.out.print(" > right");
            if(end.equals("B")){
                System.out.print(": B found");
                System.exit(0);
            }
        }
        else if(start.equals("D")){
            System.out.print("up");
            if(end.equals("A")){
                System.out.print(": A found");
                System.exit(0);
            }
            System.out.print(" > right");
            if(end.equals("B")){
                System.out.print(": B found");
                System.exit(0);
            }
            System.out.print(" > down");
            if(end.equals("C")){
                System.out.print(": C found");
                System.exit(0);
            }
        }






    }
}
