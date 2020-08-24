class Solution {
    public int majorityElement(int[] nums) {
        int response = 0;
        
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        for(int i= 0; i<nums.length; i++) {
            if(numbers.containsKey(nums[i])) {
                int count = numbers.get(nums[i]) +1;
                numbers.put(nums[i], count);
            } else {
                numbers.put(nums[i],1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if(entry.getValue() > count) {
                response = entry.getKey();
                count = entry.getValue();
            }
           }
       
        
        return response;
        
    }
}
