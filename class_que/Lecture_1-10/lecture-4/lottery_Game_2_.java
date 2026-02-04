// . Q2. Lottery Game - Part 2
// · You are given a number n.
// . Based on the value of n, print what the person wins using the following conditions:
// . MacBook Rangelf n >= 300 and n <= 460, Print "You won a MacBook!"
// . Then check:If n >= 300 and n <= 380, print "Model: M1 Mac"
// . Ifn >= 381 and n <= 460, print "Model: M2 Mac"
// · Kurkure Rangelf n >= 200 and n <= 280, Print "You won a pack of Kurkure!"
// . Then check:If n >= 200 and n <= 240, print "Flavor: Chilli Kurkure"
// . If n >= 241 and n <= 280, print "Flavor: Onion Kurkure"
// . Cycle Rangelf n >= 1100 and n <= 1500, Print "You won a Cycle!"
// . Then check:If n >=1100 and n <= 1300, print "Brand: Avon Cycle"
// . Ifn >=1301 and n <= 1500, print "Brand: Hero Cycle"
// · Bike Rangelf n > 50 and n <= 80, Print "You won a Bike!"
// . Then check:If n > 50 and n <= 65, print "Model: Bullet"
// . If n > 65 and n <= 80, print "Model: Rajdoot"
// . OtherwiseFor all other values of n, Print "Better luck next time."

import java.util.Scanner;

public class lottery_Game_2_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if (n>=300&&n<=460){
            System.out.println("You won a MacBook!");
            if (n>=300&&n<=380){
                System.out.println("Model:M1 Mac");
            }
        } else if (n>=200&&n<=280) {
            System.out.println("You won a pack of Kurkure!");
            if (n>=200&&n<=240) {
                System.out.println("Flavor:Chilli Kurkure!");
            } else if(n>=241 &&n <=280 ) {
                 System.out.println("Flavor:Onion Kurkure!");   
            }
        } else if (n>=1100&&n<=1500){
            System.out.println("You won a Cycle!");
            if (n>=1100 &&n<=1300) {
                System.out.println("Brand:Avon Cycle");
            } else if(n>=1301&&n<=1500){
                System.out.println("Brand:Hero Cycle");
            }
        }else if (n>50&&n<=80){
            System.out.println("You won the Bike!");
            if (n>50&&n<=65) {
              System.out.println("Model:Bullet");  
            } else if(n>65&&n<=80){
                System.out.println("Model:Rajdoot");
            }
        }else{
            System.out.println("Better Luck Next Time!");
        }
    }
}

