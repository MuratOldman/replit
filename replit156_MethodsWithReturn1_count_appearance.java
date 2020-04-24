package replitDesk;
//import java.util.Arrays;
public class replit156_MethodsWithReturn1_count_appearance {
/*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.

 */
   public static int count_appearance(String[] arr, String t){
       int count=0;
       for(int i=0; i<arr.length; i++){
           if(arr[i].equalsIgnoreCase(t)){
               arr[i]=arr[i].replaceFirst(t, "");
               count++;
           }
       }

       return count;
   }


    public static void main(String[] args) {
        String []names={"a","foo","bar","foo","bla" };

       int count=count_appearance(names,"foo");
        System.out.println(count);
    }















}
