




public class qusestion_2_ {
    static int Gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }return a;
    }
    public static void main(String[] args) {
        int a=18;
        int b=12;
        int result= Gcd(a,b);
        System.out.println(result);
        
    }
}
