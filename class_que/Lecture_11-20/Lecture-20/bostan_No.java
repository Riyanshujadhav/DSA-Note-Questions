
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
