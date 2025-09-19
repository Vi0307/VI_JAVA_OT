import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> ds = new ArrayList<>();

        System.out.print("Nhap so ho dan: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap bien lai ho dan thu " + (i+1));
            BienLai bl = new BienLai();
            bl.nhap(sc);
            ds.add(bl);
        }

        System.out.println("\nDanh sach bien lai tien dien");
        for (BienLai bl : ds) {
            bl.hienThi();
        }

        sc.close();
    }
}