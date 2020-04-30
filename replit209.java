package replitDesk;

public class replit209 {
    public static void main(String[] args) {

        System.out.println("1+1 = "+calc.plus(1,1) );
        System.out.println("1-1 = "+calc.minus(1,1) );

    }
    static class calc {

        public static int plus(int a, int b) {
            int result = a+b;
            return result;
        }

        public static int minus(int a, int b ) {
            int result = a-b;
            return result;
        }

    }
}
