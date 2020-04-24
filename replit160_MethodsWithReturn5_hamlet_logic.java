package replitDesk;

public class replit160_MethodsWithReturn5_hamlet_logic {

/*
The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

 */

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        boolean c=true;
           if(toBe ==true&&notToBe==true){
              c= true;
           }else if(toBe==true&&notToBe==false){
               c= true;
           }else if(toBe==false&&notToBe==true){
               c= true;
           }else if(toBe==false&&notToBe==false){
               c= false;
           }
          return c;
    }

    public static void main(String[] args) {
        boolean c=hamletQuote(true,true);
        System.out.println(c);
    }



}
