class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int p1 = i + 1, p2 = nums.length - 1;

            while(p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];

                if(sum == 0){
                    List<Integer> current = new ArrayList<>();
                    current.add(nums[i]);
                    current.add(nums[p1]);
                    current.add(nums[p2]);
                    set.add(current);
                    
                    p1++;
                    p2--;
                }
                else if(sum < 0){
                    p1++;
                }
                else {
                    p2--;
                }

            }
        }
        result.addAll(set);
        return result;
    }
}
