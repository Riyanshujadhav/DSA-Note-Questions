public class que_2_ {
    public static void main(String[] args) {
       int n=5;
       int m=(n+1)/2;
       for (int i = 1; i <=m; i++) {
           for (int j = 1; j <=i-1 ; j++) {
              System.out.print(" ");
           }for(int j=1;j<=n-2*(i-1);j++){
             if(j%2==0){
                System.out.print("0");
             }else{
                System.out.print("1");
             }   
           }
           System.out.println();
       } for (int i = m-1; i >=1; i--) {
           for (int j = 1; j <=i-1 ; j++) {
              System.out.print(" ");
           }for(int j=1;j<=n-2*(i-1);j++){
             if(j%2==0){
                System.out.print("0");
             }else{
                System.out.print("1");
             }   
           }
           System.out.println();
       } 
    }
}
