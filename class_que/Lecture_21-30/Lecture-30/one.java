
import java.util.ArrayList;
import java.util.Scanner;

public class one {
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
        for (int j = 0; j < c; j++) {
            if(j%2!=0){
                for (int i = r-1; i >= 0; i--) {
                    System.out.print(list.get(i).get(j));
                }
            }else{
                for (int i = 0; i < r; i++) {
                    System.out.print(list.get(i).get(j));
                }
            }
        }
    }
}
