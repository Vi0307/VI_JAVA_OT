import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
    private List<HoDan> list = new ArrayList<>();

    public void nhap(Scanner sc){
        System.out.println("Nhap so ho dan trong khu pho: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n ; i++) {
            System.out.println("Nhap thong tin ho dan thu: "+(i+1));
            HoDan hoDan = new HoDan();
            hoDan.nhapHoDan(sc);
            list.add(hoDan);
        }
    }

    public void hienThiTatCa(){
        for (HoDan hoDan : list) {
            hoDan.hienThiHoDan();
        }
    }

    public void hienThiNguoiTren80Tuoi(int namHienTai){
        System.out.println("=========== Danh sach nguoi tren 80 tuoi ==============");
        boolean check = false;
        for (HoDan hoDan : list) {
            if(hoDan.is80Tuoi(namHienTai)){
                hoDan.hienThiHoDan();
                check = true;
            }
        }
        if(!check){
            System.out.println("Khong co nguoi nao tren 80 tuoi!");
        }
    }
}
