
import java.util.Vector;


public class vector {
   public static void main(String[] args) {
    Vector <Integer> a =new Vector();
    Vector v1 =new Vector();

    a.add(1);
    a.add(3);
    a.add(6);
    a.add(10);
    a.add(5);
    a.set(0, 17);

    for (int i = 0; i < a.size(); i++) {
        System.out.print(a.get(i)+" ");
    }

    v1.add(23);
    v1.add("riyanshu");

    for (int i = 0; i <v1.size() ; i++) {
        System.out.println(v1);
    }



   } 
}
