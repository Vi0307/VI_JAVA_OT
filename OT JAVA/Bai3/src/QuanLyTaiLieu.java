import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuanLyTaiLieu {
    public List<TaiLieu> danhSach_149;

    public QuanLyTaiLieu() {
        danhSach_149 = new ArrayList<TaiLieu>();
    }

    public void nhapTaiLieu(Scanner sc_149) {
        System.out.println("\n--- Nhap tai lieu moi ---");
        System.out.println("1. Sach");
        System.out.println("2. Tap chi");
        System.out.println("3. Bao");
        System.out.print("👉 Chon loai tai lieu: ");
        int choice_149 = sc_149.nextInt();
        sc_149.nextLine();

        System.out.println("Nhap ma tai lieu: ");
        int maTaiLieu_149 = sc_149.nextInt();
        sc_149.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        String nhaXuatBan_149 = sc_149.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        int soBanPhatHanh_149 = sc_149.nextInt();
        sc_149.nextLine();

        TaiLieu tl_149 = null;

        switch (choice_149) {
            case 1:
                System.out.println("Nhap tac gia: ");
                String tacGia_149 = sc_149.nextLine();
                System.out.println("So trang: ");
                int soTrang_149 = sc_149.nextInt();
                sc_149.nextLine();
                tl_149 = new Sach(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149, tacGia_149, soTrang_149);
                System.out.println("Them thanh cong sach");
                break;
            case 2:
                System.out.println("Nhap so phat hanh: ");
                int soPhatHanh_149 = sc_149.nextInt();
                sc_149.nextLine();
                System.out.println("Nhap thang phat hanh: ");
                int thangPhatHanh_149 = sc_149.nextInt();
                sc_149.nextLine();
                tl_149 = new TapChi(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149, soPhatHanh_149, thangPhatHanh_149);
                System.out.println("Them thanh cong tap chi");
                break;
            case 3:
                System.out.println("Nhap ngay phat hanh (YYYY-MM-DD): ");
                String ngayPhatHanhStr_149 = sc_149.nextLine();
                Date ngayPhatHanh_149 = Date.valueOf(ngayPhatHanhStr_149);
                tl_149 = new Bao(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149, ngayPhatHanh_149);
                System.out.println("Them thanh cong bao");
                break;
            default:
                System.out.println("❌ Loai tai lieu khong hop le!");
                return;
        }

        danhSach_149.add(tl_149);
        System.out.println("Them tai lieu thanh cong");
    }

    public TaiLieu timTaiLieuTheoMa(int maTaiLieu_149) {
        for (TaiLieu tl_149 : danhSach_149) {
            if (tl_149.getMaTaiLieu_149() == maTaiLieu_149) {
                return tl_149;
            }
        }
        return null;
    }

    public void timTaiLieuTheoLoai(String loai_149) {
        boolean found_149 = false;
        for (TaiLieu tl_149 : danhSach_149) {
            switch (loai_149.toLowerCase()) {
                case "sach":
                    if (tl_149 instanceof Sach) {
                        tl_149.hienThi();
                        found_149 = true;
                    }
                    break;
                case "tap chi":
                case "tapchi":
                    if (tl_149 instanceof TapChi) {
                        tl_149.hienThi();
                        found_149 = true;
                    }
                    break;
                case "bao":
                    if (tl_149 instanceof Bao) {
                        tl_149.hienThi();
                        found_149 = true;
                    }
                    break;
            }
        }
        if (!found_149) {
            System.out.println(" Khong tim thay tai lieu nao!");
        }
    }

    public void hienThiTatCa() {
        for (TaiLieu tl_149 : danhSach_149) {
            tl_149.hienThi();
            System.out.println("----------------------------------");
        }
    }
}
