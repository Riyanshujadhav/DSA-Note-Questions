
import java.util.Scanner;



public class que {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size :");
        int n=sc.nextInt();
        System.out.println("no :");
        int eq=sc.nextInt();
        int [] arr =new int[n];
        System.out.println("elements :");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
           
        }

        for(int i=0;i<=arr.length-1;i++){
            if(eq==arr[i]){
                System.out.println("possition of "+eq+":"+(i+1));
            }
        }
    }
    
}
