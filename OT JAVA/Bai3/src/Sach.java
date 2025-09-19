
public class Sach extends TaiLieu {
    public String tacGia_149;
    public int soTrang_149;

    public Sach(int maTaiLieu_149, String nhaXuatBan_149, int soBanPhatHanh_149, String tacGia_149, int soTrang_149) {
        super(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149);
        this.tacGia_149 = tacGia_149;
        this.soTrang_149 = soTrang_149;
    }

    public String getTacGia_149() {
        return tacGia_149;
    }

    public void setTacGia_149(String tacGia_149) {
        this.tacGia_149 = tacGia_149;
    }

    public int getSoTrang_149() {
        return soTrang_149;
    }

    public void setSoTrang_149(int soTrang_149) {
        this.soTrang_149 = soTrang_149;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Tac gia: " + tacGia_149);
        System.out.println("So trang: " + soTrang_149);
    }
}
