class Solution {
    public int numRescueBoats(int[] people, int limit) {

        boolean[] visited = new boolean[people.length];
        int minBoats = 0;

        Arrays.sort(people);

        int left = 0, right = people.length - 1;

        while(left <= right){
            int remainingLimit = limit - people[right];
            right--;
            minBoats++;

            if(left <= right && remainingLimit >= people[left]){
                left++;
            }
        }

        return minBoats;
    }
}