package replitDesk;

public class replit165_Methods_with_return_10_thunder_blazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3)
    {
     if(available==true){
         return true;
     }else if(gift==true){
         return true;
     }else if(ingredient1<=3&&ingredient1>=0&&ingredient2<=3&&ingredient2>=0&&ingredient3<=3&&ingredient3>=0&&ingredient1!=ingredient2&&ingredient2!=ingredient3){
         return true;
     }else{
         return false;
     }


    }
}
