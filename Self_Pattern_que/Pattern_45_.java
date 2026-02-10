// * * * * * * * * *
//                 *
// * * * * * * *   *
// *           *   *
// *   * * *   *   *
// *   *       *   *
// *   * * * * *   *
// *               *
// * * * * * * * * *

public class Pattern_45_ {
    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==n){
                    System.out.print("* ");
                }else if((j==1&&i>=3)||(i==3&&j<=7)||(j==7&&i>=3&&i<=7)||(i==7&&j>=3&&j<=7)||(j==3&&i>=5&&i<=7)||(i==5&&j>=3&&j<=5)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}
