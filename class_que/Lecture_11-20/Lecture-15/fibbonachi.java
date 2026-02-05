
import java.util.*;
public class fibbonachi {
    static int fibbo(int n){
        
            if (n==0||n==1){
                return n;
            }else 
                return fibbo(n-1)+fibbo(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int result =fibbo(n);
        System.out.println(result);
        
    }
}
