package HackerRank;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    // Time complexity: O(N)
    // Space complexity: O(1)
    public static int countingValleys(int steps, String path) {
        // Write your code here

        int seaLevel = 0;
        int valleys = 0;

        for(int i = 0; i < steps; i++){

            if(seaLevel == 0 && path.charAt(i) == 'D'){
                valleys +=1;
            }

            if(path.charAt(i) == 'U') {
                seaLevel +=1;
            } else {
                seaLevel -=1;
            }

        }

        return valleys;
    }

}
