public class Product extends Category{
    Long id;
	String Aname;
	Double price;
	Integer quantity;
	Category category;

	public Product(String name, Long id, String proname, Double price, Integer quantity, Category category) {
        super(nameX);
		this.id = id;
		this.Aname = proname;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public Product(Long id, String name, Double price, Integer quantity, Category category) {
        super(nameX);
		this.id = id;
		this.Aname = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
}
