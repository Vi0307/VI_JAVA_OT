import java.util.Scanner;

public class Nguoi {
    private String hoTen_149;
    private int namSinh_149;
    private String ngheNghiep_149;

    public void nhap(Scanner sc){
        System.out.println("Nhap ho ten: ");
        hoTen_149 = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh_149 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nghe nghiep: ");
        ngheNghiep_149 = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("    Ho ten: " + hoTen_149 + " | Nam sinh: " + namSinh_149 + " | Nghe: " + ngheNghiep_149);
    }

    public int tinhTuoi(int namHienTai) {
        return namHienTai - namSinh_149;
    }
}
