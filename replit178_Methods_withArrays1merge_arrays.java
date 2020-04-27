package replitDesk;

import java.util.Arrays;

public class replit178_Methods_withArrays1merge_arrays {

    public static int[] mergR(int[] a,int[] b) {
        int[]arr=new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            arr[i+a.length]=b[i];
        }
        return arr;


    }//end mergR

    public static void main(String[] args)
    {
      int[]a={1,2,3};
      int[]b= {4,5};
        System.out.println(Arrays.toString(mergR(a,b)));
    }



}
