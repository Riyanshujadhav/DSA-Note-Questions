import java.util.ArrayList;
import java.util.Scanner;

public class alist2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println("2D ArrayList:");
        for (int i = 0; i < rows; i++) {
            System.out.println(list.get(i));
        }
    }
}
