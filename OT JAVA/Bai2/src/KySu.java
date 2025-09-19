import java.sql.Date;

public class KySu extends CanBo {
    private String nganhDaoTao_149;

    public KySu(String hoTen_149, Date ngaySinh_149, boolean gioiTinh_149, String diaChi_149, String nganhDaoTao_149) {
        super(hoTen_149, ngaySinh_149, gioiTinh_149, diaChi_149);
        this.nganhDaoTao_149 = nganhDaoTao_149;
    }

    public KySu(String nganhDaoTao_149) {
        this.nganhDaoTao_149 = nganhDaoTao_149;
    }

    public String getNganhDaoTao_149() {
        return nganhDaoTao_149;
    }

    public void setNganhDaoTao_149(String nganhDaoTao_149) {
        this.nganhDaoTao_149 = nganhDaoTao_149;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Nganh dao tao: " + nganhDaoTao_149);
    }
}
