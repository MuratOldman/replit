package replitDesk;

public class replit168_Methods_with_String3_cover {
    public static void main(String[] args) {
        System.out.println(coverString("java [me]thods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {

      main=main.replaceAll(coverME,"["+coverME+"]");
      return main;
    }
}
