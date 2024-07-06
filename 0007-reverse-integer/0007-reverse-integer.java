class Solution {
    public int reverse(int x) {
        
        int sign = (x<0)?-1:1;
        x=Math.abs(x);
        long revNum=0;
        while (x>0){
            int lastDigit=x%10;
            revNum=revNum*10+lastDigit;
            x/=10;
        }
        if (revNum>Integer.MAX_VALUE||revNum<Integer.MIN_VALUE){
            return 0;
        }

        return (int) revNum*sign;
    
    }
}