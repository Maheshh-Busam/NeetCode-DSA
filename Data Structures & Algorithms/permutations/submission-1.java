class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> permutations = new ArrayList<>();

        permutations(nums, result, permutations);

        return result;
    }

    public void permutations(int[] nums, List<List<Integer>> result, List<Integer> permutations) {

        if(nums.length == permutations.size()){
            List<Integer> current = new ArrayList<>(permutations);
            result.add(current);
            return;
        }


        for(int i = 0; i < nums.length; i++){

            if(permutations.contains(nums[i])){
                continue;
            }

            permutations.add(nums[i]);

            permutations(nums, result, permutations);

            permutations.remove(permutations.size() - 1);
        }
    }
}
