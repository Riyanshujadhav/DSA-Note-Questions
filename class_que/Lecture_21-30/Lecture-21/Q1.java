
import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        } return new int[]{-1,-1}; 
    }
}
// for(int 1=1;i<len;i++){
//     if(numi!=numuniq)
//         uniq++
//     num uniq=numi
// }return unq+1;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int target =9;
        int [] nums={2,7,9,5};
        Solution sol = new Solution();
        System.out.println(sol.twoSum(nums, target));
    }
    
}
