package ra.bt6;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        // phân tích yêu cầu , đọc 1 số từ 0 - 999
        // thuật toán đọc số có 1 chữ số
        System.out.println("Nhập vào 1 số tự nhiên từ 0 đến 999");
        int number = new Scanner(System.in).nextInt();
        if (number < 0) {
            return;
        } else if (number<=10){
            System.out.println(readNumber(number));
        } else if (number<=19) {
            System.out.println("mười " + readNumber(number%10));
        } else if (number<100) {
           if (number%10==0) {
               System.out.println(readNumber(number/10) + " mươi ");
           } else if (number%10==1) {
               System.out.println(readNumber(number/10) + " mươi mốt ");
           } else if (number%10==4) {
               System.out.println(readNumber(number/10) + " mươi tư ");
           } else if (number%10==5) {
               System.out.println(readNumber(number/10) + " mươi lăm ");
           } else {
               System.out.println(readNumber(number/10) + " mươi " + readNumber(number%10));
           }
        } else {
            int tram = number/100 ;
            int chuc = (number%100)/10 ;
            int donvi = number%10 ;
            if (chuc == 0 ) {
                if (donvi == 0) {
                    System.out.println(readNumber(tram) + " trăm ");
                } else {
                    System.out.println(readNumber(tram) + " linh " + readNumber(donvi));
                }
            } else {
                int ab = number%100 ;
                if (ab<=19) {
                    System.out.println(" mười " + readNumber(ab%10));
                } else {
                    if (ab%10==0) {
                        System.out.println(readNumber(tram) + " trăm " + readNumber(ab/10) + " mươi");
                    } else if (ab%10==1) {
                        System.out.println(readNumber(tram) + " trăm " + readNumber(ab/10) + " mươi mốt");
                    } else if (ab%10==4) {
                        System.out.println(readNumber(tram) + " trăm " + readNumber(ab/10) + " mươi tư");
                    } else if (ab%10==5) {
                        System.out.println(readNumber(tram) + " trăm " + readNumber(ab/10) + " mươi lăm");
                    } else {
                        System.out.println(readNumber(tram) + " trăm " + readNumber(ab/10) + " mươi "+ readNumber(ab%10));
                    }
                }
             }
        }
    }
    public static String readNumber(int number){
        switch (number){
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            case 10:
                return "mười";
            default:
                return null;
        }
    }
}
