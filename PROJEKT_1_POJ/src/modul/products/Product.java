package modul.products;

public class Product{
	private String name;
    private String code;
    private double price;
    private double discountPrice = -1;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = price;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override public String toString() {
        return "||Product: " +
        	" |name: " + name + "\t" +
            " |code: " + code + "\t" +
            " |price: " + price + "\t" +
            " |price after discount: " + discountPrice + "\t||"
            ;
    }
    


}