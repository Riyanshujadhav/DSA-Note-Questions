public class que_3_ {
    public static void main(String[] args) {
        int n=7;
        int m=(n+1)/2;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }for(int j=i;j<=i;j++){
                if(j==1)
                System.out.print(j+" ");
                else System.out.print((j-1)+" ");
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("  ");
            }for(int j=i;j<=i;j++){
                if(j!=1)
                 System.out.print((j-1)+" ");
            }
            System.out.println();
        }for(int i=m-1;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print("  ");
            }for(int j=i;j<=i;j++){
                if(j==1)
                System.out.print(j+" ");
                else System.out.print((j-1)+" ");
            }
            for(int j=1;j<=2*i-3;j++){
                System.out.print("  ");
            }for(int j=i;j<=i;j++){
                if(j!=1)
                 System.out.print((j-1)+" ");
            }
            System.out.println();
        }
    }
}
