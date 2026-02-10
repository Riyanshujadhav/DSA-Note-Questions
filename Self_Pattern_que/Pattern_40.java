
// * * * * * * * 
// *   *   *   *
// * * * * * * *
// *   *   *   *
// * * * * * * *
// *   *   *   *
// * * * * * * *

public class Pattern_40 {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n||(i==3 || i==5) || (j==3 || j==5)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
