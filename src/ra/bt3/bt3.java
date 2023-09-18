package ra.bt3;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập vào điểm Toán ");
        float toan = sc.nextFloat() ;
        System.out.println("Nhập vào điểm Lý ");
        float ly = sc.nextFloat();
        System.out.println("Nhập vào điểm Hoá ");
        float hoa = sc.nextFloat();
        System.out.println("Nhập vào điểm Văn ");
        float van = sc.nextFloat();
        System.out.println("Nhập vào điểm Tiếng Anh ");
        float english = sc.nextFloat();
        float dtb = (toan + ly + hoa + van + english) / 5 ;
        if ( dtb<=5) {
            System.out.println("Điểm trung bình của bạn loại : Yếu ");
        } else if (dtb<=6.5) {
            System.out.println("Điểm trung bình của bạn loại : Trung bình ");
        } else if (dtb<8) {
            System.out.println("Điểm trung binhf cửa bạn loại : Khá");
        } else if ( dtb<9 ) {
            System.out.println("Điểm trung bình của bạn loại : Giỏi");
        } else {
            System.out.println("Điểm trung bình của bạn loại : Xuất sắc");
        }
    }
}
