package replitDesk;

public class replit167_MethodsWith_String2Remove_Duplicates_Duplicates {

    public static String uniqueChars(String str) {
        //TODO: write your below
        String uniq="";
        for(int i=0;i<str.length();i++){
            if(!uniq.contains(""+str.charAt(i))){
                uniq+=""+str.charAt(i);
            }
        }

     return uniq;
    }


    public static void main(String[] args) {
        String unique=uniqueChars("aaabbabacclk");
        System.out.println(unique);
    }











}
