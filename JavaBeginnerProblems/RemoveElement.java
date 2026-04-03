import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={0,2,1,2,3,4,5,2};
        removeElement(nums, 2);
    }
    public  static void removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if (nums[i] == val) {
                
                swap(nums, i, j);
                j--; 
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
