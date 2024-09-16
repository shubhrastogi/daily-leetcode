class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x;
        int s=0;
        while(n>0){
            int a=n%10;
            s=s+a;
            n=n/10;
        }
        if(x%s==0)
        {
            return s;
        }
        return -1;
    }
}