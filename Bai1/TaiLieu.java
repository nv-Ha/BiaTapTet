package BaiTapTet;

public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNXB;
    protected int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String toString() {
        return "Mã tài liệu: " + maTaiLieu + ", NXB: " + tenNXB + ", Số bản phát hành: " + soBanPhatHanh;
    }
}
