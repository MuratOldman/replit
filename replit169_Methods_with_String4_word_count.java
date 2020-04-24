package replitDesk;

public class replit169_Methods_with_String4_word_count {

    public static int wordCount(String words) {

          String[] arr=words.split(" ");
          int count=arr.length;

         return count;
    }


    public static void main(String[] args) {
        int count=wordCount("ali veli hasan merak");
        System.out.println(count);
    }







}
