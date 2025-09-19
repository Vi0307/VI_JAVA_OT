import java.util.Scanner;

class KhachHang {
    private String hoTenChuHo_149;
    private String soNha_149;
    private String maSoCongTo_149;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten chu ho: ");
        hoTenChuHo_149 = sc.nextLine();
        System.out.print("Nhap so nha: ");
        soNha_149 = sc.nextLine();
        System.out.print("Nhap ma so cong to: ");
        maSoCongTo_149 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten chu ho: " + hoTenChuHo_149);
        System.out.println("So nha: " + soNha_149);
        System.out.println("Ma so cong to: " + maSoCongTo_149);
    }
}