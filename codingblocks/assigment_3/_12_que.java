
import java.util.Scanner;
public class _12_que {
    public static int rev(int n){
		int rev=0;
		 while(n!=0){
            int temp=n%10;
			if(temp==0){
				temp=5;
			}
			rev=rev*10+temp;
			n/=10;
		 }return rev;
	} 
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rev(rev(n)));	
    }
}
