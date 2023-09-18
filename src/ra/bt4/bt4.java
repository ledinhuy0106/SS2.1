package ra.bt4;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập vào số nguyên bất kỳ");
        int number = sc.nextInt() ;
        if ( number%3==0 && number%5==0) {
            System.out.println(number + " chia hết cho cả 3 và 5 ") ;
        } else if (number%3==0 && number%5!=0){
            System.out.println(number + " chỉ chia hết cho 3 và không chia hết cho 5");
        } else if (number%5==0 && number%3!=0) {
            System.out.println(number + " chỉ chia hết cho 5 và không chia hết cho 3");
        }
        else {
            System.out.println(number + " không chia hết cho cả 3 và 5");
        }
    }
}
