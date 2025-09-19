import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> danhSach_149;

    public QLCB() {
        danhSach_149 = new ArrayList<CanBo>();
    }

    // Nhập thông tin mới cho cán bộ
    public void nhapCanBo_149(Scanner sc) {
        System.out.println("\n--- Nhap can bo moi ---");
        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");
        System.out.print("👉 Chon loai can bo: ");
        int loai_149 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ho ten: ");
        String hoTen_149 = sc.nextLine();
        System.out.print("Ngay sinh (yyyy-mm-dd): ");
        String ns_149 = sc.nextLine();
        Date ngaySinh_149 = Date.valueOf(ns_149);
        System.out.print("Gioi tinh (nam/nu): ");
        String gioiTinhStr_149 = sc.nextLine();
        boolean gioiTinh_149 = gioiTinhStr_149.equalsIgnoreCase("nam");
        System.out.print("Dia chi: ");
        String diaChi_149 = sc.nextLine();

        CanBo cb_149 = null;

        switch (loai_149) {
            case 1:
                System.out.print("Nhap bac: ");
                String bac_149 = sc.nextLine();
                cb_149 = new CongNhan(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149, bac_149);
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao_149 = sc.nextLine();
                cb_149 = new KySu(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149, nganhDaoTao_149);
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec_149 = sc.nextLine();
                cb_149 = new NhanVien(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149, congViec_149);
                break;
            default:
                System.out.println("❌ Loai can bo khong hop le!");
                return;
        }

        danhSach_149.add(cb_149);
        System.out.println("✅ Da them can bo thanh cong!");
    }

    // Tìm kiếm cán bộ theo tên
    public CanBo timKiemCanBo_149(String ten_149) {
        for (CanBo canBo_149 : danhSach_149) {
            if (canBo_149.getHoTen_149().equalsIgnoreCase(ten_149)) {
                return canBo_149;
            }
        }
        return null;
    }

    public void hienThiTatCa_149() {
        for (CanBo canBo_149 : danhSach_149) {
            canBo_149.hienThi();
            System.out.println("----------------------------------");
        }
    }
}
