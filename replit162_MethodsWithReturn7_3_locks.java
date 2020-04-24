package replitDesk;

public class replit162_MethodsWithReturn7_3_locks {
    /*
    This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.
     */

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean result =true;
   if(a==true&&b==true){
       result=true;
   }else if(c==true){
       result=true;
        }
    else{
        result=false;
   }
return result;
    }//end threeLocks


    public static void main(String[] args) {
        boolean result=threeLocks(true,false,true);
        System.out.println(result);
    }








}
