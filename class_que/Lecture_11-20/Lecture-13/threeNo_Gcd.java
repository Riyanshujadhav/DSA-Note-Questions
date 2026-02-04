
public class threeNo_Gcd {

    static int gcd(int a,int b,int c){
            while(b!=0){
                int t=a%b;
                a=b;
                b=t;
            }
            while(c!=0){
                int t=a%c;
                a=c;
                c=t;
            }         
        return a;
    }

   public static void main(String[] args) {
      int a=125;
      int b=75;
      int c=10;
      int result =gcd(a, b, c);
      System.out.println(result);
      
   }  
}
