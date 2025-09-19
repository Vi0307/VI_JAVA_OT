
import java.util.Date;

public class Bao extends TaiLieu {
    public Date ngayPhatHanh_149;

    public Bao(int maTaiLieu_149, String nhaXuatBan_149, int soBanPhatHanh_149, Date ngayPhatHanh_149) {
        super(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149);
        this.ngayPhatHanh_149 = ngayPhatHanh_149;
    }

    public Date getNgayPhatHanh_149() {
        return ngayPhatHanh_149;
    }

    public void setNgayPhatHanh_149(Date ngayPhatHanh_149) {
        this.ngayPhatHanh_149 = ngayPhatHanh_149;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh_149);
    }
}
