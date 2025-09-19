import java.sql.Date;

public class NhanVien extends CanBo {
    private String congViec_149;

    public NhanVien(String hoTen_149, Date ngaySinh_149, boolean gioiTinh_149, String diaChi_149, String congViec_149) {
        super(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149);
        this.congViec_149 = congViec_149;
    }

    public NhanVien(String congViec_149) {
        this.congViec_149 = congViec_149;
    }

    public String getCongViec_149() {
        return congViec_149;
    }

    public void setCongViec_149(String congViec_149) {
        this.congViec_149 = congViec_149;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Cong viec: " + congViec_149);
    }
}
