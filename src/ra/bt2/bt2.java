package ra.bt2;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Chiều dài của hình chữ nhật là : ");
        float cd = sc.nextFloat() ;

        System.out.println("CHiều rộng của hình chữ nhật là : ");
        float cr = sc.nextFloat() ;

        float cv = (cd + cr) * 2 ;
        System.out.println("chu vi của hình chữ nhật là " + cv ) ;

        float dt = cd * cr ;
        System.out.println("Diện tích của hình chữ nhật là " + dt );

    }
}
