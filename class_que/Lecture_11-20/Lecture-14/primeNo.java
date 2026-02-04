
import java.util.*;
public class primeNo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        boolean isprime=true;
    for(int i=2;i<=n-1;i++){
        if(n%i==0){
            isprime=false;  
            //System.out.println(i);
            break;
        }
    }
        if(isprime)   
            System.out.println("The No is Prime");
        else
        System.out.println("The No is Not PrimeNo");
  }  
}
