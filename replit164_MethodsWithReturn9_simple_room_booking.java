package replitDesk;

public class replit164_MethodsWithReturn9_simple_room_booking {

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
boolean result=true;
    if(isAvailable==false){
        result=false;
    }else if(year!=2018){
        result=false;
    }else if(month==7&&day>=1&&day<=7){
        result=false;
    }


return result;

    }


    public static void main(String[] args) {
       boolean result= simpleRoomBook(true,7,22,2018);
        System.out.println(result);
    }



}
