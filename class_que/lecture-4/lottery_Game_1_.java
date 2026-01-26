// · Q1. Lottry game
// · You are given a number n.
// . You have to determine what the person wins based on the following conditions:
// . Ifn >= 300 and n <= 460, the prize is MacBook.
// · Ifn >= 200 and n <= 280, the prize is Kurkure.
// . Ifn >= 1100 and n <= 1500, the prize is Cycle.
// . If n > 50 and n <= 80, the prize is Bike.
// . For all other values of n, print "Better luck next time.


import java.util.Scanner;

public class lottery_Game_1_ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=300&&n<=460){
            System.out.println("Macbook");
        }else if (n>=200&&n<=280) {
            System.out.println("Kurkure");
        } else if(n>=1100&&n<=1500) {
            System.out.println("Cycle");
        }else if (n>50  && n<=80) {
            System.out.println("Bike");
        } else {
            System.out.println("Better luck next time");
        }
    }
}

