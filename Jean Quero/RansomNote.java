class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         
        char[] m = magazine.toCharArray();
        for (char n : ransomNote.toCharArray()) {
            int find = 0;
            for (int i = 0; i < m.length; i++) {
                if(m[i]== n) {
                    m[i]=',';
                    find = 1;
                    break;

                }
            }
            if(find==0)
                return false;
        }


        return true;
    }
}
