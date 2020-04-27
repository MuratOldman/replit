package replitDesk;
import java.util.Arrays;

public class replit176_MethodOverloading1 {

    public static int findMax(int[] arr){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        return max;

    }

    public static double findMax(double[]arr){
        Arrays.sort(arr);
        double max=arr[arr.length-1];
        return max;
    }




}
