class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] out = new int[2];

        System.out.println("running");
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0 ; i< nums.length ; i++){
            int c = target - nums[i];
        System.out.println(c + " " + i);

            if (m.containsKey(c)){
                return new int[]{m.get(c),i};
            }

            m.put(nums[i],i);
        }
        return new int[]{};
    }
}