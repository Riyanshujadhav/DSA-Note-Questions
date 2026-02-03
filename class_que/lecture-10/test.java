// 1                 9 
// 2 8             8 2 
// 3 7 3         7 3 7 
// 4 6 4 6     6 4 6 4 
// 5 5 5 5 5 5 5 5 5 5 
// 6 4 6 4     4 6 4 6 
// 7 3 7         3 7 3 
// 8 2             2 8 
// 9                 1 
import java.util.*;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(i==5){
                        System.out.print(n+" ");
                    }else if(j%2!=0){
                        System.out.print(i+" ");
                    }else{
                        System.out.print((2*n)-i+" ");
                    }
                }for(int j=1;j<=2*(n-i);j++){
                    System.out.print("  ");
                }for(int j=1;j<=i;j++){
                    if(j%2==0){
                        System.out.print(i+" ");
                    }else{
                        System.out.print((2*n)-i+" ");
                    }
                }
            System.out.println();
        }for(int i=n-1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    if(j%2==0){
                        System.out.print(i+" ");
                    }else{
                        System.out.print((2*n)-i+" ");
                    }
                }for(int j=1;j<=2*(n-i);j++){
                    System.out.print("  ");
                }for(int j=1;j<=i;j++){
                    if(j%2!=0){
                        System.out.print(i+" ");
                    }else{
                        System.out.print((2*n)-i+" ");
                    }
                }
            System.out.println();
        }       
    }
}
