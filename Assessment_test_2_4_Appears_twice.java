package replitDesk;

public class Assessment_test_2_4_Appears_twice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
    int count=0;
    target=target.toLowerCase();
    sentence=sentence.toLowerCase();
    if(sentence.contains(target)) {
        sentence=sentence.replaceFirst(target, "");
        count++;

    }
    if(count==2){
        return true;
    }


        return false;
    }




}
