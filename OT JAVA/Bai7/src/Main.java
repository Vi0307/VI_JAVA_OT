import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> ds = new ArrayList<>();

        System.out.print("Nhap so luong hoc sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i+1));
            HocSinh hs = new HocSinh();
            hs.nhap(sc);
            ds.add(hs);
        }

        System.out.println("\nHoc sinh sinh nam 1985 va que o Thai Nguyen la:");
        for (HocSinh hs : ds) {
            if (hs.getNamSinh_149() == 1985 && hs.getQueQuan_149().equalsIgnoreCase("Thai Nguyen")) {
                hs.hienThi();
            }
        }

        System.out.println("\nHoc sinh cua lop 10A1");
        for (HocSinh hs : ds) {
            if (hs.getLop_149().equalsIgnoreCase("10A1")) {
                hs.hienThi();
            }
        }

        sc.close();
    }

}