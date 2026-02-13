import java.util.Scanner;

public class _08_que {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		
		for(int i=min;i<=max;i+=step){

			int celcus= (int)((5.0 / 9) * (i - 32));
			System.out.println(i+"	"+celcus);
		}
    }
}
