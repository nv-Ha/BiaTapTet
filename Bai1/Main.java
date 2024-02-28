package BaiTapTet;

import java.util.Scanner;

public class Main {
    //Run: chcp 65001
     public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("//-------MENU-------//");
            System.out.println("1. Thêm mới tài liệu");
            System.out.println("2. Xoá tài liệu");
            System.out.println("3. Hiện thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    themMoiTaiLieu(scanner, quanLySach);
                    break;
                case 2:
                    System.out.print("Nhập mã tài liệu cần xoá: ");
                    String maTaiLieuCanXoa = scanner.nextLine();
                    quanLySach.xoaTaiLieu(maTaiLieuCanXoa);
                    break;
                case 3:
                    quanLySach.hienThiThongTin();
                    break;
                case 4:
                    System.out.print("Nhập loại tài liệu cần tìm kiếm (Sach/TapChi/Bao): ");
                    String loaiTaiLieuCanTim = scanner.nextLine();
                    quanLySach.timKiemTheoLoai(loaiTaiLieuCanTim);
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void themMoiTaiLieu(Scanner scanner, QuanLySach quanLySach) {
        System.out.println("Chọn loại tài liệu cần thêm:");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.print("Chọn loại (1-3): ");
        int loai = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        System.out.print("Nhập mã tài liệu: ");
        String maTaiLieu = scanner.nextLine();
        System.out.print("Nhập tên NXB: ");
        String tenNXB = scanner.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBanPhatHanh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        switch (loai) {
            case 1:
                System.out.print("Nhập tên tác giả: ");
                String tenTacGia = scanner.nextLine();
                System.out.print("Nhập số trang: ");
                int soTrang = scanner.nextInt();
                quanLySach.themTaiLieu(new Sach(maTaiLieu, tenNXB, soBanPhatHanh, tenTacGia, soTrang));
                break;
            case 2:
                System.out.print("Nhập số phát hành: ");
                int soPhatHanh = scanner.nextInt();
                System.out.print("Nhập tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                quanLySach.themTaiLieu(new TapChi(maTaiLieu, tenNXB, soBanPhatHanh, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                System.out.print("Nhập ngày phát hành: ");
                String ngayPhatHanh = scanner.nextLine();
                quanLySach.themTaiLieu(new Bao(maTaiLieu, tenNXB, soBanPhatHanh, ngayPhatHanh));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
