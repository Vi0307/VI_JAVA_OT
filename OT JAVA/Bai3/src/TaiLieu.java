
public class TaiLieu {
    public int maTaiLieu_149;
    public String nhaXuatBan_149;
    public int soBanPhatHanh_149;

    public TaiLieu(int maTaiLieu_149, String nhaXuatBan_149, int soBanPhatHanh_149) {
        this.maTaiLieu_149 = maTaiLieu_149;
        this.nhaXuatBan_149 = nhaXuatBan_149;
        this.soBanPhatHanh_149 = soBanPhatHanh_149;
    }

    public int getMaTaiLieu_149() {
        return maTaiLieu_149;
    }

    public void setMaTaiLieu_149(int maTaiLieu_149) {
        this.maTaiLieu_149 = maTaiLieu_149;
    }

    public String getNhaXuatBan_149() {
        return nhaXuatBan_149;
    }

    public void setNhaXuatBan_149(String nhaXuatBan_149) {
        this.nhaXuatBan_149 = nhaXuatBan_149;
    }

    public int getSoBanPhatHanh_149() {
        return soBanPhatHanh_149;
    }

    public void setSoBanPhatHanh_149(int soBanPhatHanh_149) {
        this.soBanPhatHanh_149 = soBanPhatHanh_149;
    }

    public void hienThi() {
        System.out.println("Ma tai lieu: " + maTaiLieu_149);
        System.out.println("Nha xuat ban: " + nhaXuatBan_149);
        System.out.println("So ban phat hanh: " + soBanPhatHanh_149);
    }
}
