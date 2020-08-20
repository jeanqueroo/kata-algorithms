class Solution {
    public int numJewelsInStones(String J, String S) {
        String[] jewels = J.split("");
        String[] myStone = S.split("");
        int response = 0;

        for (int i = 0;  i < myStone.length; i++) {
            for (int j = 0; j < jewels.length; j++) {
              if(jewels[j].equals(myStone[i]))
                  response++;

            }

        }
        return response;
    }
}
