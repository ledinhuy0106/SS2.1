import jdk.nashorn.internal.parser.JSONParser;

import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // sout : hiển thị ới new line
        // souf : hiện thị fomast
//        System.out.println("Hello and welcome ");
//        System.err.println("Đây là lỗi ");
        // Hiển thị voiws mã màu trong màn console
//        System.out.println("\u001B[31mRed textfdfd");
//        System.out.println("\u001B[32mGreen text");
//        System.out.println("\u001B[33mYellow text");
//        System.out.println("\u001B[34mBlue text");
//        System.out.println("\u001B[35mPurple text");
//        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
//        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");

        // biến và kiểu dữ liệu

        // kiểu nguyên thuỷ :
        // cú pháp [ kiểu dữ liệu ] [ tên biến ] = [ giá trị ] ;
//        int number = 10;
        // số thực
//        float fl = 5.9F;
        //
//        double db = 10.0;
        //
//        char ch = 'a';
        //
//        boolean check = true;
        // nếu giá trị là chuôi thì sử dụng %s , nêys là số nguyên thì dùng %d ,
        // nếu là số thực thì dùng %f , nếu là các kiểu khác thì măc định là %s
//        System.out.printf("\u001B[32mnumber = %-5d | fl = %-5.2f | db = %5.2f | ch = %s | check = %-10s \n", number, fl, db, ch, check);
        // Kiểu dữ liệu tham chiếu
//        String name = "Hồ Xuân Hùng" ; // char[] khi thay đổi giá trị của 1 chuỗi thì tạo ra 1 mảng giá trị mới
//        String str = name ;
//        name = "name" ;
//        Date date = new Date() ;
//        System.out.println("Ngày tháng hiện tại là : " + date);
//        System.out.println("\u001B[35mHọ và tên " + name);
//        System.out.println(str);

        // đây là máy quét dùng để nhập dữ liệu từ màn hình console
//        Scanner sc = new Scanner(System.in) ;
        // nhập chuỗi , số , số thực , boolean , byte ,.....
//        System.out.println("Hãy nhập vào địa chỉ ");
//        String address = sc.nextLine() ;
//        System.out.println("Địa chỉ " + address);
//        System.out.println("Hãy nhập vào một số ");
//        int a = Integer.parseInt(sc.nextLine()) ; // ép kiểu
//        System.out.println("Số bạn vừa nhập là " + a);
//        // lưu ý : khi vừa nhập số mà chuyển sang nhập chuỗi thĩe bị nuốt dòng
//        System.out.println("nhập vào 1 chuỗi");
//        String string = sc.nextLine() ;

        // khai báo biến hằng
//        final  float PI = 3.14F ;

        // toán tử 1 ngôi
        // ++ --  dùng để giảm hoặc tăng giá trị của biến 1 đơn vị
        // tiền tố : ++a hoặc --a : biểu thức này sẽ trả về giá trị cửa biến sau khi tăng hoặc giảm
//        int a = 10 ;
//        int b = 100 ;
//         System.out.println(++a);
//        System.out.println(--a);
        // hậu tố : a++ hoặc a-- : biu thức này s trả về giá trị của biến trước khi tăng hoặc giảm giá trị


        // toán tử 3 ngôi
        // ( biểu thức logic ) ? ( nếu đúng ) : ( nếu sai )
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Hãy nhập vào 1 số ");
        int number = sc.nextInt() ;
//        String rc = (number%2==0) ? "số chẵn" : "Số lẻ" ;
//        System.out.println(rc);

        // câu lệnh điều kiện
        // chỉ có if
//      `1                                                                                                                                                                                                                                                                                                                                                                                   `
        // if .. else
        // kiểm tra chẵn lẻ
        if (number%2==0) {
            System.out.println(number + " là số chẵn");
        } else {
            System.out.println(number + " là số lẻ");
        }

        // bậc thang
        float dtb = 7.0f ;
        if (dtb<5.0) {
            // yếu
        } else if (dtb<6.5){
            // trung bình
        } else if (dtb>7) {
            // giỏi
        } else {
            // xuất sắc
        }

        // lồng nhau
        // tính năm nhuận
        int year = 3000 ;
        if (year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("năm nhuận");
                } else {
                    System.out.println("không phải năm nhuận");
                }
            } else {
                System.out.println("không phải năm nhuaajn");
            }
        } else {
            System.out.println("Không phải năm nhuận");
        }

        // switch case
        // hiển thị số dư khi chia hết cho 5
        int so = 1997 ;
        int mod = so%5 ;
        switch (mod) {
            case 0 :
                System.out.println("chia hết");
                break;
            case 1 :
                System.out.println("dư 1");
                break;
            case 2 :
                System.out.println("dư 2");
                break;
            case 3 :
                System.out.println("dư 3");
                break;

            case 4 :
                System.out.println("dư 4");
                break;
        }

    }
}