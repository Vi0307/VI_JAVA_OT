import java.util.Scanner;

class SinhVien {
    private String hoTen_149;
    private String msv_149;
    private String ngaySinh_149;
    private String lop_149;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_149 = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        msv_149 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh_149 = sc.nextLine();
        System.out.print("Nhap lop: ");
        lop_149 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_149);
        System.out.println("MSV: " + msv_149);
        System.out.println("Ngay sinh: " + ngaySinh_149);
        System.out.println("Lop: " + lop_149);
    }

    public String getHoTen_149() {
        return hoTen_149;
    }
}