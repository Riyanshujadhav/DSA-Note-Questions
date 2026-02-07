public class revleet {
    class Solution {
    public int reverse(int x) {
        if(x>Integer.MIN_VALUE/10 || x<Integer.MAX_VALUE/10){
        int rev=0;
        while(x!=0){
            int t=x%10;
            rev=rev*10+t;
            x/=10;
        }
        return rev;
        } 
        else{
            return 0;
        }
    }
}
   public static void main(String[] args) {
    int n=3;
      //  reverse r=new reverse(n);
      
      //int res=r.reverse(n);
   } 
}
