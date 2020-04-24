package replitDesk;

public class replit159_MethodsWithReturn4_Profit_or_loss {

    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        String trade="";
      if(sellPrice>buyPrice){
             trade="profit";
           }
      else if(sellPrice<buyPrice){
          trade="loss";
      }
      else{
          trade="no loss";
      }
        System.out.println(trade);
      return trade;
    }


    public static void main(String[] args) {
        c_profits(100,50);
    }














}
