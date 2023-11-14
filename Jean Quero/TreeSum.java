import java.util.*;
import java.util.stream.Collectors;

public class TreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(j != i ) {
                    for (int k = 0; k < nums.length; k++) {
                        if (k != j && k!= i) {
                            if ((nums[i]+ nums[j] + nums[k]) == 0) {
                                if (!result.contains(List.of(nums[i], nums[j], nums[k]))
                                        && !result.contains(List.of(nums[i], nums[k], nums[j]))
                                        && !result.contains(List.of(nums[j], nums[k], nums[i]))
                                        && !result.contains(List.of(nums[j], nums[i], nums[k]))
                                        && !result.contains(List.of(nums[k], nums[i], nums[j]))
                                        && !result.contains(List.of(nums[k], nums[j], nums[i]))) {
                                    result.add(List.of(nums[i], nums[j], nums[k]));
                                }

                            }
                        }

                    }
                }


            }
        }


        return result;
    }

    public List<List<Integer>> threeSum2(int[] n) {
        Arrays.sort(n);
        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0 ; i<n.length; i++){
            if(i ==0 || n[i] != n[i-1]){
                int j = i+1;
                int k = n.length -1;
                while(j < k){
                    sum = n[j] + n[k] +n[i];
                    if(sum > 0){
                        k--;
                    }
                    else if(sum < 0){
                        j++;
                    }
                    else{
                        ArrayList<Integer> inside = new ArrayList<>();
                        inside.add(n[i]);
                        inside.add(n[j]);
                        inside.add(n[k]);
                        list.add(inside);

                        while (j < k && n[j] == n[j+1]){
                            j++;
                        }
                        while(j < k && n[k] == n[k-1]){
                            k--;
                        }

                        j++;
                        k--;
                    }
                }
            }
        }
        return list;

    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int j = i +1;
            int k = l -1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == target) {
                    return target;
                }

                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                }

                closest = Math.abs(target - sum) > Math.abs(target - closest) ? closest : sum;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
           //  threeSum(new int[]{-1,0,1,2,-1,-4});
        threeSumClosest(new int[]{1,1,1,0}, -100);
    }


}
