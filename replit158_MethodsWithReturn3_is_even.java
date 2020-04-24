package replitDesk;

public class replit158_MethodsWithReturn3_is_even {

    public static boolean isEven(int n){
        boolean even=false;
        if(n%2==0){

              even=true;
        }
        System.out.println(even);
        return even;

    }

/*
isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.
 */
public static void main(String[] args) {
    isEven(8);
}











}
