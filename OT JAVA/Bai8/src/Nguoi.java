import java.util.Scanner;

class Nguoi {
    protected String hoTen_149;
    protected String ngaySinh_149;
    protected String queQuan_149;

    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_149 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh_149 = sc.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan_149 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_149);
        System.out.println("Ngay sinh: " + ngaySinh_149);
        System.out.println("Que quan: " + queQuan_149);
    }
}