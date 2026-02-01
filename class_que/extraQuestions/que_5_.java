


public class que_5_ {
    public static void main(String[] args) {
       int n=5;
        for (int i = 2; i <=n; i++) {
            if(i==2||i==3){
                System.out.print(i+"    ");
            }
            if (i%2==0) {   
            }else
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){}else
                System.out.print(i+"    ");
            }
        } 
    
    }
}
