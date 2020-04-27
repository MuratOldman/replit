package replitDesk;

public class replit186_Method_String12extract_number_from_string {
    public static String extractNum(String s) {
        String numbers="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                numbers+=""+s.charAt(i);
            }

        }


       return numbers;

    }

    public static void main(String[] args) {
         String numbers =extractNum("abc012");
        System.out.println(numbers);
    }

}
