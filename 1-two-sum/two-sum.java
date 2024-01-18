import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            for(int j=1; j<nums.length;j++) {
                int iVal=nums[i];
                int jVal=nums[j];
                if(iVal+jVal==target&&i!=j) {
                    output.add(i);
                    output.add(j);
                    return output.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return new int[]{};
    }
}