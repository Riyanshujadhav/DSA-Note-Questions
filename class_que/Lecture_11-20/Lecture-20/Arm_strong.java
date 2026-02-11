import java.util.Scanner;

public class Arm_strong {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int len=0;
    int sum=0;
    int num=n;
    int eq=n;
        while(n!=0){
            len++;
            n/=10;
        }
        
        System.out.println("length :"+len);
        while (num!=0) { 
            int t=num%10;
            sum=sum+(int)Math.pow(t, len);     
            num/=10;
        }
        System.out.println(sum);

        if(eq==sum){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not ArmStrong");
        }
    }
}
