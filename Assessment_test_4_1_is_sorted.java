package replitDesk;

public class Assessment_test_4_1_is_sorted {
    public static boolean isSort(int[] nums)
    {
     for(int i=0;i<nums.length-1;i++){
         if(nums[i]>=nums[i+1]){
           return false;

         }
     }
        return true;
    }

    public static void main(String[] args) {
        int aa[]={2,3,1,4};
        boolean a=isSort(aa);
        System.out.println(a);
    }

}
