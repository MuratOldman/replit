package replitDesk;

public class replit166_MethodsWithString1_merge_them {

    public static String mergeStrings(String one, String two) {
         String result="";
    if(one.length()==two.length()){
        int j=0;
        for(int i=0;i<one.length();i++){
            result+=""+one.charAt(i)+two.charAt(j);
            j++;
        }
    }
   else if(one.length()>two.length()){
       int j=0;
        for(int i=0;i<two.length();i++){
            result+=""+one.charAt(i)+two.charAt(j);
            j++;
        }
        result+=""+one.substring(two.length(),one.length());
    }
   else if(one.length()<two.length()){
        int j=0;
        for(int i=0;i<one.length();i++){
            result+=""+one.charAt(i)+two.charAt(j);
            j++;
        }
        result+=""+two.substring(one.length(),two.length());
    }




          return result;
    }


    public static void main(String[] args) {
        String result=mergeStrings("123","abc");
        System.out.println(result);
    }





}
