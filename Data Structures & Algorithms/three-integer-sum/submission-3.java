class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> current = new ArrayList<>();
                        current.add(nums[i]);
                        current.add(nums[j]);
                        current.add(nums[k]);
                        Collections.sort(current);
                        set.add(current);
                    }
                }
            }
        }

        result.addAll(set);
        return result;
    }
}
