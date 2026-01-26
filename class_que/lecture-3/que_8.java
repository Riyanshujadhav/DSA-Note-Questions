// Find The Sum of n Natural Number ?

import java.util.Scanner;

public class que_8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
           sum=sum+i;
        }
        System.out.println(sum);
    }
}
