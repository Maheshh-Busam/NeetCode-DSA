class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(num != val){
                list.add(num);
            }
        }

        int index = 0;
        for(int num : list){
            nums[index++] = num;
        }

        return list.size();
    }
}