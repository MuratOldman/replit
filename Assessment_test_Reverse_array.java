package replitDesk;
import java.util.Arrays;
public class Assessment_test_Reverse_array {
    public static void main(String[] args) {
        String[] arr={"ali","veli"};
         String[] arr1=reverse(arr);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        String[]arr1=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j]=arr[i];
            j++;
        }
        arr=arr1;


        return arr;
    }


}
