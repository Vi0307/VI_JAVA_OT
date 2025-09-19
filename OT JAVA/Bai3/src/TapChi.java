public class TapChi extends TaiLieu {
    public int soPhatHanh_149;
    public int thangPhatHanh_149;

    public TapChi(int maTaiLieu_149, String nhaXuatBan_149, int soBanPhatHanh_149, int soPhatHanh_149, int thangPhatHanh_149) {
        super(maTaiLieu_149, nhaXuatBan_149, soBanPhatHanh_149);
        this.soPhatHanh_149 = soPhatHanh_149;
        this.thangPhatHanh_149 = thangPhatHanh_149;
    }

    public int getSoPhatHanh_149() {
        return soPhatHanh_149;
    }

    public void setSoPhatHanh_149(int soPhatHanh_149) {
        this.soPhatHanh_149 = soPhatHanh_149;
    }

    public int getThangPhatHanh_149() {
        return thangPhatHanh_149;
    }

    public void setThangPhatHanh_149(int thangPhatHanh_149) {
        this.thangPhatHanh_149 = thangPhatHanh_149;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("So phat hanh: " + soPhatHanh_149);
        System.out.println("Thang phat hanh: " + thangPhatHanh_149);
    }
}
