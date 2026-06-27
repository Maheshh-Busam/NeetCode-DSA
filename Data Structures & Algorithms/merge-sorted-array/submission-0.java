class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];

       int p1 = 0, p2 = 0;
       int index = 0;

       while(p1 < m && p2 < n){
            if(nums1[p1] <= nums2[p2]){
                result[index++] = nums1[p1++];
            }
            else if(nums2[p2] < nums1[p1]){
                result[index++] = nums2[p2++];
            }

       }

       while(p1 < m){
        result[index++] = nums1[p1++];
       }

       while(p2 < n){
        result[index++] = nums2[p2++];
       }

       for(int i = 0; i < result.length; i++){
            nums1[i] = result[i];
       }

    }
}