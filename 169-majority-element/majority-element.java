class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int out=0;
        for (int num : nums) {
            if (mp.containsKey(num)) {
                // System.out.println(mp);

                mp.put(num, mp.get(num) + 1);
            } else {
                mp.put(num, 1);
            }
        }
        int maxValue = Collections.max(mp.values());
        System.out.println("mp: "+ mp);
        System.out.println("max value: " + maxValue);

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println("after for: " + entry.getKey());

            if (entry.getValue().equals(maxValue)) {
                System.out.println("inside if max value: "+ maxValue);

                out = entry.getKey();
                System.out.println("maxValue if: " + maxValue);
            }
        }
        return out;
    }
}