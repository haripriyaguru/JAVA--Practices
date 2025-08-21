class Solution2 {
    public int reverseExponentiation(int n) {
        // code here
        int rev=0;
        int base=n;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        int power = rev;
        int c=1;
        for(int i=1;i<=power;i++){
             c=c*base;
        }
        return c;
    }
}
