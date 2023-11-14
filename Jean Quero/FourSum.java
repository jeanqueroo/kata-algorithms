import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {


            int j = i +1, k, l = j+1;

            while (j < nums.length && l < nums.length) {

                if(Integer.MAX_VALUE <  nums[i] +nums[j]) {
                    break;
                }
                k = nums.length-1;


                if ((l != k) && (((long)nums[i] +(long)nums[j] + (long)nums[l] +(long)nums[k]) == target)) {
                    result.add(List.of(nums[i],nums[j], nums[l], +nums[k]));
                    l++;
                } else {
                    while (l < k) {
                        if ((l != k) && (((long)nums[i] +(long)nums[j] +(long)nums[l] +(long)nums[k]) == target)) {
                            result.add(List.of(nums[i],nums[j], nums[l], +nums[k]));
                        }
                        if(((long)nums[i] +(long)nums[j] + (long)nums[l] + (long)nums[k]) > target) {
                            k--;
                        } else {
                            l++;
                        }
                    }
                    j++;
                    l = j+1;
                }
            }
        }
        return result.stream().distinct().collect(Collectors.toList());
    }



    public static void main(String[] args) {
        fourSum(new int[] {1000000000,1000000000,1000000000,1000000000},-294967296);
    }
}
