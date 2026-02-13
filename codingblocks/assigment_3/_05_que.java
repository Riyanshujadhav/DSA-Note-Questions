import java.util.Scanner;

public class _05_que{
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int series=0;
        int count=0;
        int i=1;
		while(count<n1){
			series=3*i+2;
			if(series%n2!=0){
                System.out.println(series);
                count++;
            }
            i++;
            
		}
    }
}