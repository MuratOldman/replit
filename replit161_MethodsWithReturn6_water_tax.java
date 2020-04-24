package replitDesk;

public class replit161_MethodsWithReturn6_water_tax {
/*
This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).
 */
    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
 if(units<=50){
     bill=units*0.60;
 }
else if(units>50&&units<=100){
    bill=units*0.90;
 }
else if(units>100&&units<=150){
    bill=units*0.90+50;
 }else {
    bill=units*0.90+100;
 }

        //end your code here


        return bill;
    }//end waterTax


    public static void main(String[] args) {
        double bill=waterTax(151);
        System.out.println(bill);
    }








}
