import java.sql.Date;

public class CanBo {
    private String hoTen_149;
    private Date ngaySinh_149;
    private boolean gioiTinh_149;
    private String diaChi_149;

    public CanBo(String hoTen_149, Date ngaySinh_149, boolean gioiTinh_149, String diaChi_149) {
        this.hoTen_149 = hoTen_149;
        this.ngaySinh_149 = ngaySinh_149;
        this.gioiTinh_149 = gioiTinh_149;
        this.diaChi_149 = diaChi_149;
    }

    public CanBo() {
    }

    public String getHoTen_149() {
        return hoTen_149;
    }

    public void setHoTen_149(String hoTen_149) {
        this.hoTen_149 = hoTen_149;
    }

    public Date getNgaySinh_149() {
        return ngaySinh_149;
    }

    public void setNgaySinh_149(Date ngaySinh_149) {
        this.ngaySinh_149 = ngaySinh_149;
    }

    public boolean isGioiTinh_149() {
        return gioiTinh_149;
    }

    public void setGioiTinh_149(boolean gioiTinh_149) {
        this.gioiTinh_149 = gioiTinh_149;
    }

    public String getDiaChi_149() {
        return diaChi_149;
    }

    public void setDiaChi_149(String diaChi_149) {
        this.diaChi_149 = diaChi_149;
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_149);
        System.out.println("Ngay sinh: " + ngaySinh_149);
        System.out.println("Gioi tinh: " + (gioiTinh_149 ? "Nam" : "Nu"));
        System.out.println("Dia chi: " + diaChi_149);
    }
}
