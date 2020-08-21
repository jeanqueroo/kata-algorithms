class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character, Integer> maga = new HashMap<Character, Integer>();
        for (char m: magazine.toCharArray()) {
            if (maga.containsKey(m)){
                int count = maga.get(m) +1;
                maga.put(m, count);
            } else {
                maga.put(m, 1);
            }

        }

        for (char r : ransomNote.toCharArray()) {
            if (maga.containsKey(r) == false)
                return false;
            int count = maga.get(r);
            if (count == 0)
                return false;
            maga.put(r,count-1);
        }
        return true;
    }
}
