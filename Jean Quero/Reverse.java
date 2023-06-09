public class Reverse {

    public int reverse(int x) {
       /* int rev_num = 0;
        while (x != 0) {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;
        }

        if(rev_num > Integer.MAX_VALUE || rev_num < Integer.MIN_VALUE )
          return 0;
        return rev_num;*/

        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}
