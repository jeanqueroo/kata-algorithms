package HackerRank;

import java.util.Hashtable;

// Warm up challenges
public class SockMerchant {

    // Time complexity: O(N)
    // Space complexity: O(N)
   public static int sockMerchant(int n, int[] ar) {

        // O(N)
        Hashtable<Integer, Integer> socks = new Hashtable<>(); // C1 -> 3, C2 -> 2, C3 -> 1

        int pairsNumbers = 0; // 2

        // O(N)
        for (int i = 0; i < n; i++) { // ar = 1, 2, 1, 2, 1, 3, 2

            if (socks.containsKey(ar[i])) { // F, F, T, T, T, T                   O(1)
                int currentSocksQty = socks.get(ar[i]); // 1, 1, 2, 2           O(1)

                if ((currentSocksQty + 1) % 2 == 0) {
                    pairsNumbers += 1;
                }
                socks.put(ar[i], currentSocksQty + 1); // O(1)
            } else {
                socks.put(ar[i], 1); // O(1)
            }

        }

        return pairsNumbers;
    }

}
