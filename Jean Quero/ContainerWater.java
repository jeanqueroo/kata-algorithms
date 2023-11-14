public class ContainerWater {
    public static int maxArea(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int  c=0;
            for (int j = i; j < height.length; j++) {
                if (height[i] > height[j]) {
                    if ((height[j]*c) > result) {
                        result = height[j]*c;
                    }
                }

                if (height[i] <= height[j]) {
                    if ((height[i]*c) > result) {
                        result = height[i]*c;
                    }
                }
                c++;
            }

        }

        return result;
    }

    public int maxArea2(int[] height) {
        // Maximum area will be stored in this variable
        int maximumArea = Integer.MIN_VALUE;
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Loop until left and right meet
        while (left < right) {
            // Shorter pole/vertical line
            int shorterLine = Math.min(height[left], height[right]);
            // Update maximum area if required
            maximumArea = Math.max(maximumArea, shorterLine * (right - left));
            // If there is a longer vertical line present
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }

    public static void main(String[] args) {
        maxArea(new int[] {1,1});
    }
}
