package ArrayQuestions;
import java.util.Arrays;

public class DuplicateElement {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    
}
