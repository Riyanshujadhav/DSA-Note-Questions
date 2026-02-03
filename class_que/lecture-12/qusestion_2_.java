
public class qusestion_2_ {
    static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }return a;
    }
    public static void main(String[] args) {
        int a=18;
        int b=54;
        int result= gcd(a,b);
        System.out.println(result);
        
    }
}
