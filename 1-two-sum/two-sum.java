class Solution {
    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
           if(map.containsKey(target - numbers[i])){
                return new int[] {i, map.get(target - numbers[i])};
           }
           map.put(numbers[i],i);
        }
        
        return new int[] {};

    }
}