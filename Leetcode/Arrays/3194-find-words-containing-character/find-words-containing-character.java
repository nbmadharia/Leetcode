class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int len = words.length;

        List<Integer> out = new ArrayList<>();
        
        for (int i =0; i< len ; i++){
            if (words[i].contains(String.valueOf(x)))
                {
                out.add(i);
            }
                
            
        }
                return out;
    }
}