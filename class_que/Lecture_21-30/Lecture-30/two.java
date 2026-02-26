import java.util.ArrayList;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int r=sc.nextInt();
        int c=sc.nextInt();
        for (int i = 0; i < r; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        int left=0,right=r-1,top=0, bottom=r-1;
        while(left<=right && top<=bottom){
            for (int i = left; i <=right; i++) {
                System.out.print(list.get(top).get(i));
            } top++;
            for (int i = top; i <=bottom; i++) {
                System.out.print(list.get(i).get(right));
            } right--;
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    System.out.print(list.get(bottom).get(i));
                }bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top; i--) {
                    System.out.print(list.get(i).get(left));
                }left++;
            }
        }
    }
}
