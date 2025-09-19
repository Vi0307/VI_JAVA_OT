import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> ds = new ArrayList<>();

        System.out.print("Nhap so luong can bo giao vien: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin CBGV thu " + (i+1));
            CBGV gv = new CBGV();
            gv.nhap(sc);
            ds.add(gv);
        }

        System.out.println("\n=== Danh sách CBGV có lương thực lĩnh >= 8,000,000 ===");
        for (CBGV gv : ds) {
            if (gv.getLuongThucLinh_149() >= 8000000) {
                gv.hienThi();
            }
        }

        sc.close();
    }
}