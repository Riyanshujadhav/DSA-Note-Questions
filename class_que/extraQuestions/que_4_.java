public class que_4_ {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for(int j= 1; j <= n; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("1 ");
                }else if(i==3&&j==3){
                    System.out.print("6 ");
                }else if( i==j ){
                    System.out.print("2 ");
                }else if(i==2&&j==4||i==4&&j==2){
                    System.out.print("4 ");
                }else{
                    System.out.print("3 ");
                }
            }
            System.out.println();
        }
    }
}
