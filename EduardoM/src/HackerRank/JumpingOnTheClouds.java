package HackerRank;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(int[] c) {

        int i = 0;
        int jumps = 0;

        while (i < c.length) {

            if (i + 2 < c.length) {
                if (c[i + 2] != 1) {
                    i += 2;
                } else {
                    i += 1;
                }
            } else {
                i += 1;
            }

            jumps += 1;
        }

        return jumps - 1;
    }

    public static int jumpingOnCloudsImproved(int[] c) {

        int i = 0;
        int jumps = 0;

        while (i < c.length - 1) {

            if (i + 2 < c.length && c[i + 2] != 1) {
                i += 2;
            } else {
                i += 1;
            }

            jumps += 1;
        }

        return jumps;
    }

}
