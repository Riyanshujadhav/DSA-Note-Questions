import java.util.Scanner;

public class _02_que {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=sc.nextInt();
		int count=0;
		while(num!=0){
			int temp=num%10;
			if(temp==digit){
				count++;
			}
			num=num/10;
		}
		System.out.println(count);

    }
}
