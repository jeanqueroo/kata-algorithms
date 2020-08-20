class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels =  new HashSet<Character>();
        int response = 0;
        for (char j : J.toCharArray()) {
            jewels.add(j);
        }
        for (char s: S.toCharArray()){
            if(jewels.contains(s))
                response++;
        }
        return response;
    }
}
