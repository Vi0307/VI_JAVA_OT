import java.util.Scanner;

class HocSinh extends Nguoi {
    private String lop_149;
    private String khoaHoc_149;
    private String kyHoc_149;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap lop:: ");
        lop_149 = sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        khoaHoc_149 = sc.nextLine();
        System.out.print("Nhap ky hoc: ");
        kyHoc_149 = sc.nextLine();
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Lop: " + lop_149);
        System.out.println("Khoa hoc: " + khoaHoc_149);
        System.out.println("Ky hoc: " + kyHoc_149);
        System.out.println("----------------------");
    }

    public String getLop_149() {
        return lop_149;
    }
}