package BaiTapTet;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String toString() {
        return super.toString() + ", Tác giả: " + tenTacGia + ", Số trang: " + soTrang;
    }
}
