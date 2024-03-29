import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> products;

	public ProductManager() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void updateProduct(Long idToUpdate, String newName, Double newPrice, Integer newQuantity,
			Category newCategory) {
		for (Product product : products) {
			if (product.id.equals(idToUpdate)) {
				product.Aname = newName;
				product.price = newPrice;
				product.quantity = newQuantity;
				product.category = newCategory;
				return;
			}
		}
		System.out.println("Không tìm thấy sản phẩm để cập nhật.");
	}

	public void deleteProduct(Long id) {
		products.removeIf(product -> product.id.equals(id));
	}

	public Product getProductById(Long id) {
		for (Product product : products) {
			if (product.id.equals(id)) {
				return product;
			}
		}
		return null;
	}

	public void displayAllProducts() {
		for (Product product : products) {
			System.out.println(product.id + " - " + product.Aname + " - " + product.price + " - " + product.quantity
					+ " - " + product.category.nameX);
		}
	}

	public void displayProductsByCategory(String category) {
		for (Product product : products) {
			if (product.category.nameX.equals(category)) {
				System.out.println(product.id + " - " + product.Aname + " - " + product.price + " - "
						+ product.quantity + " - " + product.category.nameX);
			}
		}
	}

	public Double calculateTotalPrice() {
		Double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.price * product.quantity;
		}
		return (Double) totalPrice;
	}

	public void displayPrice(Double price) {
		for (Product product : products) {
			if (product.price > price) {
				System.out.println(product.id + " - " + product.Aname + " - " + product.price + " - "
						+ product.quantity + " - " + product.category.nameX);
			}
		}
	}

	public void displayPriceAndCategory(Double price, String categoryName) {
		for (Product product : products) {
			if (product.price > price && product.category.nameX.equals(categoryName)) {
				System.out.println(product.id + " - " + product.Aname + " - " + product.price + " - "
						+ product.quantity + " - " + product.category.nameX);
			}
		}
	}
}

