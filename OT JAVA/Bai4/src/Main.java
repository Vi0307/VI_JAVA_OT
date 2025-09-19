import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ts_149 = new TuyenSinh();
        int choice;
        do {
            System.out.println("\n===== MENU TUYEN SINH =====");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Hien thi tat ca thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap so bao danh: ");
                    int sbd_149 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String hoten_149 = sc.nextLine();
                    System.out.print("Nhap dia chi: ");
                    String diachi_149 = sc.nextLine();
                    System.out.print("Nhap dien uu tien: ");
                    String uutien_149 = sc.nextLine();

                    System.out.print("Chon khoi thi (A/B/C): ");
                    String khoi_149 = sc.nextLine().toUpperCase();

                    ThiSinh tsinh_149 = null;
                    switch (khoi_149) {
                        case "A": case "a":
                            tsinh_149 = new KhoiA(sbd_149, hoten_149, diachi_149, uutien_149);
                            break;
                        case "B": case "b":
                            tsinh_149 = new KhoiB(sbd_149, hoten_149, diachi_149, uutien_149);
                            break;
                        case "C": case "c":
                            tsinh_149 = new KhoiC(sbd_149, hoten_149, diachi_149, uutien_149);
                            break;
                        default:
                            System.out.println("Khối không hợp lệ!");
                    }
                    if (tsinh_149 != null)
                        ts_149.nhapThiSinh(tsinh_149);
                    break;

                case 2:
                    System.out.println("\n=== Danh sach thi sinh ===");
                    ts_149.hienThiTatCa();
                    break;

                case 3:
                    System.out.print("Nhap so bao danh can tim ");
                    int timSBD = sc.nextInt();
                    sc.nextLine();
                    ts_149.timKiemTheoSBD(timSBD);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
