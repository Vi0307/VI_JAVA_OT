import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_149;
    private Date ngaySinh_149;
    private String cmnd_149;
    public Nguoi(String hoTen_149, Date ngaySinh_149, String cmnd_149) {
        this.hoTen_149 = hoTen_149;
        this.ngaySinh_149 = ngaySinh_149;
        this.cmnd_149 = cmnd_149;
    }

    public Nguoi() {
    }

    // Định dạng ngày (dd/MM/yyyy)
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void nhap(Scanner sc) {
        System.out.println("Nhập họ tên: ");
        hoTen_149 = sc.nextLine();

        System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
        String strNgaySinh = sc.nextLine();
        try {
            ngaySinh_149 = sdf.parse(strNgaySinh);
        } catch (ParseException e) {
            System.out.println("Ngày sinh không hợp lệ, mặc định 01/01/2000");
            try {
                ngaySinh_149 = sdf.parse("01/01/2000");
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }

        System.out.print("Nhập số CMND: ");
        cmnd_149 = sc.nextLine();
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
    public String getCmnd_149() {
        return cmnd_149;
    }
    public void setCmnd_149(String cmnd_149) {
        this.cmnd_149 = cmnd_149;
    }

    public void hienThiCaNhan(){
        System.out.println("Ho ten: "+hoTen_149);
        System.out.println("Ngay sinh: "+ngaySinh_149);
        System.out.println("Chung minh nhan dan: "+cmnd_149);

    }
}