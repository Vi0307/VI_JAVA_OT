import java.util.Scanner;

public class KhachSan {
    private Nguoi nguoi_149;
    private int soNgayTro_149;
    private String loaiPhong_149;
    private double giaPhong_149;

    public void nhap(Scanner sc){
        nguoi_149 = new Nguoi();
        nguoi_149.nhap(sc);

        System.out.println("Nhap so ngay tro: ");
        soNgayTro_149 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap loai phong: ");
        loaiPhong_149 = sc.nextLine();

        System.out.println("Nhap gia phong: ");
        giaPhong_149 = sc.nextDouble();
    }

    public void hienThi(){
        nguoi_149.hienThiCaNhan();
        System.out.println("So ngay tro: "+soNgayTro_149);
        System.out.println("Loai phong: "+loaiPhong_149);
        System.out.println("Gia phong: "+giaPhong_149);
    }

    public double tinhTien(){
        return soNgayTro_149 * giaPhong_149;
    }

    public String getSoCMND(){
        return nguoi_149.getCmnd_149();
    }
}