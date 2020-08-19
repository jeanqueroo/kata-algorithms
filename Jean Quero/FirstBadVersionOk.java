/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int init = 0;
        int last = n;
        
        while (init < last){
            int midPoint = init + (last - init) / 2;
            if(isBadVersion(midPoint)) {
              last = midPoint;
            } else {
              init = midPoint + 1;
            }
        }
        
        if (init == last && isBadVersion(init)) {
            return init;
        }
        return -1;
    }
}
