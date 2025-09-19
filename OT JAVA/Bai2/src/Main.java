import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QLCB qlcb_149 = new QLCB();
        Scanner sc_149 = new Scanner(System.in);
        int choice_149;
        do {
            System.out.println("\n===== MENU QUAN LY CAN BO =====");
            System.out.println("1. Nhap thong tin can bo moi");
            System.out.println("2. Tim kiem can bo theo ten");
            System.out.println("3. Hien thi toan bo danh sach can bo");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            choice_149 = sc_149.nextInt();
            sc_149.nextLine();

            switch (choice_149) {
                case 1:
                    qlcb_149.nhapCanBo_149(sc_149);
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim: ");
                    String ten_149 = sc_149.nextLine();
                    CanBo cb_149 = qlcb_149.timKiemCanBo_149(ten_149);
                    if(cb_149 != null){
                        System.out.println("Can bo " + ten_149 + " co ton tai");
                        cb_149.hienThi();
                    }else{
                        System.out.println("Khong ton tai can bo co ten: " + ten_149);
                    }
                    break;
                case 3:
                    qlcb_149.hienThiTatCa_149();
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
