import java.sql.Date;

public class CongNhan extends CanBo {
    private String bac_149;

    public CongNhan(String hoTen_149, Date ngaySinh_149, boolean gioiTinh_149, String diaChi_149, String bac_149) {
        super(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149);
        this.bac_149 = bac_149;
    }

    public CongNhan(String bac_149) {
        this.bac_149 = bac_149;
    }

    public String getBac_149() {
        return bac_149;
    }

    public void setBac_149(String bac_149) {
        this.bac_149 = bac_149;
    }

    @Override
    public void hienThi(){
        super.hienThi();
        System.out.println("Bac cong nhan: " + bac_149);
    }
}
