import java.util.Scanner;

class CBGV extends Nguoi {
    private double luongCung_149;
    private double thuong_149;
    private double phat_149;
    private double luongThucLinh_149;

    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap luong cung: ");
        luongCung_149 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap thuong: ");
        thuong_149 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phat: ");
        phat_149 = Double.parseDouble(sc.nextLine());

        tinhLuongThucLinh();
    }

    private void tinhLuongThucLinh() {
        luongThucLinh_149 = luongCung_149 + thuong_149 - phat_149;
    }

    public void hienThi() {
        super.hienThi();
        System.out.println("Luong cung: " + luongCung_149);
        System.out.println("Thuong: " + thuong_149);
        System.out.println("Phat: " + phat_149);
        System.out.println("Luong thuc linh: " + luongThucLinh_149);
        System.out.println("-----------------------");
    }

    public double getLuongThucLinh_149() {
        return luongThucLinh_149;
    }
}