class Solution {
    public int firstUniqChar(String s) {
         HashMap<Character, Integer> first = new HashMap<Character, Integer>();
        for(char f: s.toCharArray()) {
            if (first.containsKey(f)) {
                int count = first.get(f)+1;
                first.put(f, count);
            } else
                first.put(f,1);
        }

        int response = -1;
        char[] it = s.toCharArray();
        for(int i = 0; i < it.length; i++) {
            int count = first.get(it[i]);
            if(count == 1)
                return i;
        }
        return response;
        
    }
}
