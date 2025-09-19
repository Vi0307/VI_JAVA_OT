import java.util.Arrays;

public class KhoiC extends ThiSinh{
    private final String khoi = "C";
    private final String[] monThi = {"Van", "Su", "Dia"};

    public KhoiC(int soBaoDanh_149, String hoTen_149, String diaChi_149, String dienUuTien_149) {
        super(soBaoDanh_149, hoTen_149, diaChi_149, dienUuTien_149);
    }

    public KhoiC() {
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("SBD: " + soBaoDanh_149 + " | Ho ten: " + hoTen_149
                + " | Dia chi: " + diaChi_149 + " | Uu tien: " + dienUuTien_149
                + " | Khoi: " + khoi + " | Mon: " + Arrays.toString(monThi));
    }

}
