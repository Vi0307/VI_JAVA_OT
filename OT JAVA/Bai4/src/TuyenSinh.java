import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    private List<ThiSinh> listThiSinh = new ArrayList<>();

    public void nhapThiSinh(ThiSinh thiSinh){
        listThiSinh.add(thiSinh);
    }

    public void hienThiTatCa(){
        for (ThiSinh thiSinh : listThiSinh) {
            thiSinh.hienThiThongTin();
        }
    }

    public void timKiemTheoSBD(int sbd){
        for (ThiSinh thiSinh : listThiSinh) {
            if(thiSinh.getSoBaoDanh_149() == sbd){
                thiSinh.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co sbd la: "+sbd);
    }

}
