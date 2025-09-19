import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachSan> list = new ArrayList<>();
        System.out.println("Nhap so luong khach tro: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin khach hang "+(i + 1)+": ");
            KhachSan ks = new KhachSan();
            ks.nhap(sc);
            list.add(ks);
        }

        //Hiển thị danh sách
        System.out.println("Danh sach khach tro: ");
        for (KhachSan khachSan : list) {
            khachSan.hienThi();
        }

        //Tính tiền khi khách trả phòng
        sc.nextLine();
        System.out.println("Nhap so CMND khach muon tra phong:");
        String cmnd = sc.nextLine();

        boolean found = false;
        for (KhachSan khachSan : list) {
            if(khachSan.getSoCMND().equals(cmnd)){
                System.out.println("So tien can tra: "+khachSan.tinhTien());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong tim thay khach co CMND tren");
        }

        //Xóa khách
        System.out.println("Nhap so CMND khach can xoa: ");
        String cmndXoa = sc.nextLine();
        list.removeIf(ks -> ks.getSoCMND().equals(cmndXoa));

        //Hien thi lại danh sach sau khi xoa
        System.out.println("Danh sach sau khi xoa");
        for (KhachSan khachSan : list) {
            khachSan.hienThi();
        }
    }
}