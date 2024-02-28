import java.util.List;
import java.util.Scanner;

public class Main {
    //Run: chcp 65001
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ProductManager productManager = new ProductManager();
		
		// tạo danh mục và sản phẩm
		
		Category Category1 = new Category("Điện tử");
		Category Category2 = new Category("Quần áo");
		Category Category3 = new Category("Đồ gia dụng");

		
		productManager.addProduct(new Product((long) 1, "LapTop", 1700000.0, 15, Category1));
		productManager.addProduct(new Product((long) 2, "Pc", 550000.0, 20,Category2 ));
		productManager.addProduct(new Product((long) 3, "Case", 300000.0, 25, Category3));

		
		int choice;
		
		do {
			System.out.println("//-------MENU-------//");
			System.out.println("1. Tạo mới 1 product");
			System.out.println("2. Sửa thông tin product theo id" );
			System.out.println("3. Xóa product theo id");
			System.out.println("4. Hiển thị product theo id");
			System.out.println("5. Hiển thị tất cả product");
			System.out.println("6. Hiển thị product theo category");
			System.out.println("7. Tính tổng tiền");
			System.out.println("8. Các product có giá trên 100000");
			System.out.println("9. Product có giá trên 200000 và có category là Điện tử");
			System.out.println("0. Thoát !");
			
			System.out.println("Vui lòng nhập lựa chọn !");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1: 
				try {
					System.out.print("Nhập id sản phẩm mới: ");
					Long newId = scanner.nextLong();
					scanner.nextLine();
					System.out.print("Nhập tên sản phẩm mới: ");
					String newName = scanner.nextLine();
					System.out.print("Nhập giá sản phẩm mới: ");
					Double newPrice = scanner.nextDouble();
					System.out.print("Nhập số lượng sản phẩm mới: ");
					Integer newQuantity = scanner.nextInt();
					System.out.print("Nhập tên danh mục sản phẩm mới: ");
					String newCategoryName = scanner.next();
					Category newCategory = new Category(newCategoryName);

					productManager.addProduct(new Product(newId, newName, newPrice, newQuantity, newCategory));
					System.out.println("Thêm thành công !");
				}catch( Exception ex) {
					System.out.println("Dữ liệu không đúng định dạng !");
					scanner.nextLine();
				}
				break;
			case 2:
				System.out.print("Nhập Id sản phẩm cần sửa thông tin: ");
				Long IDupdate = scanner.nextLong();
				scanner.nextLine();

				System.out.print("Nhập tên sản phẩm mới: ");
				String newName = scanner.nextLine();
				System.out.print("Nhập giá sản phẩm mới: ");
				Double newPrice = scanner.nextDouble();
				System.out.print("Nhập số lượng sản phẩm mới: ");
				Integer newQuantity = scanner.nextInt();
				System.out.print("Nhập tên danh mục sản phẩm mới: ");
				String newCategoryName = scanner.next();
				Category newCategory = new Category(newCategoryName);
				productManager.updateProduct(IDupdate, newName, newPrice, newQuantity, newCategory);
				System.out.println("Cập nhật thành công.");
				break;
			case 3:
				System.out.print("Nhập id sản phẩm cần xóa: ");
				Long IDdelete = scanner.nextLong();
				scanner.nextLine();
				productManager.deleteProduct(IDdelete);
				System.out.println("Xóa thành công.");
				break;
			case 4:
				System.out.print("Nhập id : ");
				Long idDisplay = scanner.nextLong();
				scanner.nextLine();
				Product product = productManager.getProductById(idDisplay);
				if (product != null) {
					System.out.println(product.id + " / " + product.nameX + " / " + product.price + " / "
							+ product.quantity + " / " + product.category.nameX);
				} else {
					System.out.println("ID không tồn tại, vui lòng nhập lại !");
				}
				break;
			case 5:
				productManager.displayAllProducts();
				break;
			case 6:
				System.out.print("Nhập category: ");
				String categoryName = scanner.nextLine();
				productManager.displayProductsByCategory(categoryName);
				break;
			case 7:
				System.out.println("Chưa tính được tổng tiền !");
				break;
			
			case 8:
				productManager.displayPrice(120000.0);
				break;
			case 9:
				productManager.displayPriceAndCategory(250000.0,"Điện tử");
				break;
			}
			
		}while(choice != 0);
		scanner.close();
	}
}
