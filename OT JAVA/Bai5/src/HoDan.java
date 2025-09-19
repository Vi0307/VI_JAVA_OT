import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoDan {
    private int soNha_149;
    private List<Nguoi> thanhVien_149 = new ArrayList<>();

    public void nhapHoDan(Scanner sc){
        int soThanhVien;
        System.out.println("Nhap so nha: ");
        soNha_149 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so thanh vien: ");
        soThanhVien = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thanh vien thu "+(i+1)+" :");
            Nguoi nguoi = new Nguoi();
            nguoi.nhap(sc);
            thanhVien_149.add(nguoi);
        }
    }

    public void hienThiHoDan(){
        System.out.println("Ho so nha: " + soNha_149 + " co " + thanhVien_149.size() + " thanh vien");
        for (Nguoi nguoi : thanhVien_149) {
            nguoi.hienThi();
        }
    }

    public boolean is80Tuoi(int namHienTai){
        for (Nguoi nguoi : thanhVien_149) {
            if (nguoi.tinhTuoi(namHienTai) >= 80) {
                return true;
            }
        }
        return false;
    }
}
