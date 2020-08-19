/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int response = 0;
        for (int i = 1; i < n +1; i++){
            if(isBadVersion(i)) {
              response = i;
              break;  
            }
        }
        return response;
    }
}
