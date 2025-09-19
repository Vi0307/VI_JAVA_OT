import java.util.Scanner;

class TheMuon {
    private String soPhieuMuon_149;
    private String ngayMuon_149;
    private String hanTra_149;
    private String soHieuSach_149;
    private String tenSach_149;
    private SinhVien sv_149;

    public void nhap(Scanner sc) {
        sv_149 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien");
        sv_149.nhap(sc);

        System.out.println("Nhap thong tin the muon");
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon_149 = sc.nextLine();
        System.out.print("Nhap ngay muon (dd/MM/yyyy): ");
        ngayMuon_149 = sc.nextLine();
        System.out.print("Nhap han tra (dd/MM/yyyy): ");
        hanTra_149 = sc.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach_149 = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach_149 = sc.nextLine();
    }

    public void hienThi() {
        sv_149.hienThi();
        System.out.println("So phieu muon: " + soPhieuMuon_149);
        System.out.println("Ngay muon: " + ngayMuon_149);
        System.out.println("Han tra: " + hanTra_149);
        System.out.println("So hieu sach: " + soHieuSach_149);
        System.out.println("Ten sach: " + tenSach_149);
        System.out.println("----------------------------");
    }

    public String getHanTra_149() {
        return hanTra_149;
    }

    public String getTenSach_149() {
        return tenSach_149;
    }

    public SinhVien getSinhVien_149() {
        return sv_149;
    }
}
