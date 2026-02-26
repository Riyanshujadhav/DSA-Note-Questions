// 2d vector-->  vector<vector<int>>a(n,vector<int>(m));
// 2d array list -->
import java.util.*;
public class arraylist2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Initialize rows
        for (int i = 0; i < rows; i++) {
            list.add(new ArrayList<>());
        }

        // Taking input
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        // Printing 2D ArrayList
        System.out.println("2D ArrayList:");
        for (int i = 0; i < rows; i++) {
            System.out.println(list.get(i));
        }

        sc.close();
    }
}


