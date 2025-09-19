public class main {
    public static void main(String[] args) {
        PhanSo sp1_149 = new PhanSo(2, 3);
        PhanSo sp2_149 = new PhanSo(4, 5);

        PhanSo spTong_149 = sp1_149.cong(sp2_149);

        System.out.println("Phân số 1: " + sp1_149);
        System.out.println("Phân số 2: " + sp2_149);
        System.out.println("Tổng: " + spTong_149);

        System.out.println("Hiệu: " + sp1_149.tru(sp2_149));
        System.out.println("Tích: " + sp1_149.nhan(sp2_149));
        System.out.println("Thương: " + sp1_149.chia(sp2_149));

        System.out.println("Phân số 1 có tối giản không? " + sp1_149.laToiGian());
        System.out.println("Phân số 2 dạng tối giản: " + sp2_149.rutGon());
    }
}
