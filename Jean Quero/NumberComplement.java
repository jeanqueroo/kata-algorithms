class Solution {
    public int findComplement(int num) {
        int response = 0;
        boolean it = true;
        for(int i = 1; it; i *= 2) {
           response +=(num%2) == 1 ? 0 : 1 * i; 
           num = num/2;
           if(num == 1) {
               it = false;
           } else if (num == 0) {
               it = false;
               response += num*(i*2);
           }
         
        }
        return response;
    }
}
