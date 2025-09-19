import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTaiLieu qltl_149 = new QuanLyTaiLieu();
        Scanner sc_149 = new Scanner(System.in);
        int choice_149;
        do {
            System.out.println("\n===== MENU QUAN LY TAI LIEU =====");
            System.out.println("1. Nhap thong tin tai lieu");
            System.out.println("2. Tim kiem tai lieu theo ten");
            System.out.println("3. Tim kiem tai lieu theo ma tai lieu");
            System.out.println("4. Hien thi toan bo danh sach tai lieu");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice_149 = sc_149.nextInt();
            sc_149.nextLine();

            switch (choice_149) {
                case 1:
                    qltl_149.nhapTaiLieu(sc_149);
                    break;
                case 2:
                    System.out.print("Nhap ten loai tai lieu: ");
                    String ten_149 = sc_149.nextLine();
                    qltl_149.timTaiLieuTheoLoai(ten_149);
                    break;
                case 3:
                    System.out.print("Nhap ma tai lieu: ");
                    int maTaiLieu_149 = sc_149.nextInt();
                    sc_149.nextLine();
                    TaiLieu tl_149 = qltl_149.timTaiLieuTheoMa(maTaiLieu_149);
                    if (tl_149 != null) {
                        System.out.println("Tai lieu ton tai");
                        tl_149.hienThi();
                    } else {
                        System.out.println("Tai lieu khong ton tai");
                    }
                    break;
                case 4:
                    qltl_149.hienThiTatCa();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice_149 != 0);
        sc_149.close();
    }
}
