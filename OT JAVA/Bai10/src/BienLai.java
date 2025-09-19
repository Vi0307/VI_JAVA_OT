import java.util.Scanner;

class BienLai {
    private KhachHang kh_149;
    private int chiSoCu_149;
    private int chiSoMoi_149;
    private long soTienPhaiTra_149;

    public void nhap(Scanner sc) {
        kh_149 = new KhachHang();
        System.out.println("Nhap thong tin khach hang");
        kh_149.nhap(sc);

        System.out.print("Nhap chi so cu: ");
        chiSoCu_149 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap chi so moi: ");
        chiSoMoi_149 = Integer.parseInt(sc.nextLine());

        tinhTienDien();
    }

    private void tinhTienDien() {
        soTienPhaiTra_149 = (long)(chiSoMoi_149 - chiSoCu_149) * 750;
    }

    public void hienThi() {
        kh_149.hienThi();
        System.out.println("Chi so cu: " + chiSoCu_149);
        System.out.println("Chi so moi: " + chiSoMoi_149);
        System.out.println("So tien phai tra: " + soTienPhaiTra_149 + " VND");
        System.out.println("----------------------------");
    }
}