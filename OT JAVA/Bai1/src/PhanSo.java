public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor không tham số
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // Constructor có tham số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0!");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Hàm tìm UCLN (Euclid)
    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Kiểm tra phân số tối giản
    public boolean laToiGian() {
        return UCLN(tuSo, mauSo) == 1;
    }

    // Rút gọn phân số
    public PhanSo rutGon() {
        int uc = UCLN(tuSo, mauSo);
        return new PhanSo(tuSo / uc, mauSo / uc);
    }

    // Cộng
    public PhanSo cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).rutGon();
    }

    // Trừ
    public PhanSo tru(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).rutGon();
    }

    // Nhân
    public PhanSo nhan(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).rutGon();
    }

    // Chia
    public PhanSo chia(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        if (mau == 0) {
            throw new ArithmeticException("Không thể chia cho 0!");
        }
        return new PhanSo(tu, mau).rutGon();
    }

    // Xuất phân số
    public String toString() {
        if (mauSo == 1) return tuSo + "";
        return tuSo + "/" + mauSo;
    }
}

