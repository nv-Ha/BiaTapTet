package BaiTapTet;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();

    public void themTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    public void xoaTaiLieu(String maTaiLieu) {
        for (int i = 0; i < danhSachTaiLieu.size(); i++) {
            if (danhSachTaiLieu.get(i).maTaiLieu.equals(maTaiLieu)) {
                danhSachTaiLieu.remove(i);
                System.out.println("Đã xoá tài liệu có mã: " + maTaiLieu);
                return;
            }
        }
        System.out.println("Không tìm thấy tài liệu có mã: " + maTaiLieu);
    }

    public void hienThiThongTin() {
        System.out.println("Danh sách tài liệu trong thư viện:");
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            System.out.println(taiLieu.toString());
        }
    }

    public void timKiemTheoLoai(String loai) {
        System.out.println("Danh sách tài liệu loại " + loai + ":");
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equalsIgnoreCase(loai)) {
                System.out.println(taiLieu.toString());
            }
        }
    }
}
