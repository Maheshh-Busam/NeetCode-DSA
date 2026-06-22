class Solution {
    public List<List<Integer>> permute(int [] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> current = new ArrayList<>();

        permutations(nums, result, current);

        return result;
    }

    public void permutations(int[] nums, List<List<Integer>> result, List<Integer> current) {

        if(nums.length == current.size()){
            List permutations = new ArrayList<>(current);
            result.add(permutations);
            return;
        }

        for(int i = 0; i < nums.length; i++){

            if(current.contains(nums[i])){
                continue;
            }

            current.add(nums[i]);

            permutations(nums, result, current);

            current.remove(current.size() - 1);
        }
    }
}
