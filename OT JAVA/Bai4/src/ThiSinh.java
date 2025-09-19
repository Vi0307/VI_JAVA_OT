abstract class ThiSinh {
    protected int soBaoDanh_149;
    protected String hoTen_149;
    protected String diaChi_149;
    protected String dienUuTien_149;
    public ThiSinh(int soBaoDanh_149, String hoTen_149, String diaChi_149, String dienUuTien_149) {
        this.soBaoDanh_149 = soBaoDanh_149;
        this.hoTen_149 = hoTen_149;
        this.diaChi_149 = diaChi_149;
        this.dienUuTien_149 = dienUuTien_149;
    }
    public ThiSinh() {
    }
    public int getSoBaoDanh_149() {
        return soBaoDanh_149;
    }
    public void setSoBaoDanh_149(int soBaoDanh_149) {
        this.soBaoDanh_149 = soBaoDanh_149;
    }
    public String getHoTen_149() {
        return hoTen_149;
    }
    public void setHoTen_149(String hoTen_149) {
        this.hoTen_149 = hoTen_149;
    }
    public String getDiaChi_149() {
        return diaChi_149;
    }
    public void setDiaChi_149(String diaChi_149) {
        this.diaChi_149 = diaChi_149;
    }
    public String getDienUuTien_149() {
        return dienUuTien_149;
    }
    public void setDienUuTien_149(String dienUuTien_149) {
        this.dienUuTien_149 = dienUuTien_149;
    }

    public abstract void hienThiThongTin();

}
