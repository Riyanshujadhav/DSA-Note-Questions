

public class methord {
    static void txt(){
        System.out.println("no return,no argument");
    }
    static void nametxt(String name){
        System.out.println("no return,argument"+name);
    }
    static int point(){
        return 1;
    }
    static int add(int a,int b){
        return a+b;
    }
   public static void main(String[] args) {
    txt();
    nametxt("dfsgws");
    System.out.println(point());
    System.out.println(add(4,5));
   } 
}
