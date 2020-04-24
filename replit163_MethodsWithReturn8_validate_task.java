package replitDesk;

public class replit163_MethodsWithReturn8_validate_task {


    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        boolean result =true;
        if(notEmpty==true&&taskId==currentId+1){
            result=true;
        }else{
            result=false;
        }

      return result;
    }

    public static void main(String[] args) {
        boolean result=validateTask(true,9,7);
        System.out.println(result);
    }






}
