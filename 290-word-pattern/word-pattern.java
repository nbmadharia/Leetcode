class Solution {
   public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> mp = new HashMap<>();
        Map<String, Character> mpReverse = new HashMap<>();
        char[] keyy= pattern.toCharArray();
        String[] valuee = s.split(" ");

        if (valuee.length != keyy.length) return false;

        for(int i=0; i< keyy.length ; i++){
            if(mp.containsKey(keyy[i])){
                String sss = mp.get(keyy[i]);
                if(!valuee[i].equals(sss)){
                    return false;
                }
            }
            else{
                mp.put(keyy[i],valuee[i]);
            }
            if(mpReverse.containsKey(valuee[i])){

                if(mpReverse.get(valuee[i]) != keyy[i]){
                    return false;
                }
            }
            else{
                mpReverse.put(valuee[i],keyy[i]);
            }
        }
        return true;
    }
}