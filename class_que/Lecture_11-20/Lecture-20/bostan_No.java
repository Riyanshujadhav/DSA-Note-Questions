
import java.util.Scanner;

public class bostan_No {

    public static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		if (n <= 1 || isPrime(n)) {
            System.out.println(0);
            return;
        }
		int originalDigitSum = digitSum(n);
        int factorDigitSum = 0;
        int temp = n;
		for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                factorDigitSum += digitSum(i);
                temp /= i;
            }
        }
		if (temp > 1) {
            factorDigitSum += digitSum(temp);
        }

        if (originalDigitSum == factorDigitSum)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

// public static int digitsum(int n){
//         int digits=0;
//         while(n!=0){
//             int temp=n%10;
//             digits+=temp;
//             n/=10;
//         }
//         return digits;
//     }
//     public static boolean isprime(int n){
//         if(n<=1){
//             return false;
//         }
//         for(int i=2;i<Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }return true;
//     }
//     public static int factorsum(int n){
//         int factorsum=0;
//         for(int i=2;i*i<=n;i++){
//             while(n%i==0){
//                 factorsum+=digitsum(i);
//                 n/=i;
//             }
//         }
//         if(n>1){
//             factorsum+=digitsum(n);
//         }
//         return factorsum;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         isprime(n);
//         int digitsum=digitsum(n);
//         int factorsum=factorsum(n);
//         if(digitsum==factorsum){
//             System.out.print( "is Boston");
//         }else{
//             System.out.print("Not Bostan");
//         }
//     }