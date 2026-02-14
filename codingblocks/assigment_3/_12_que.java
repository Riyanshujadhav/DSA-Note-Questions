
import java.util.Scanner;
public class _12_que {
    public static int rev(int n){
		int rev=1;
		 while(n!=0){
            int temp=n%10;
			if(temp==0){
				temp=5;
			}
			rev=rev*10+temp;
			n/=10;
		 }return rev;
	} 
	public static int rev2(int n){
		int rev=0;
		while (n!=0){
			int temp=n%10;
			rev=rev*10+temp;
			n/=10;
		}return rev/10;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(rev2(rev(n)));	
    }
}
