package replitDesk;


import java.util.Arrays;
import java.util.Scanner;

public class replit149_Methods11_addtoarray_VoidMethods {

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
    int[]arr=new int[r.length+1];
     for(int i=0;i<r.length;i++){
         arr[i]=r[i];
     }
       arr[r.length]=n;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<size;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }


}
