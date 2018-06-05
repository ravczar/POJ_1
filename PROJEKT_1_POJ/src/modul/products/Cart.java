package modul.products;

import java.util.ArrayList;
import java.util.List;

import modul.manager.Manager;

public class Cart {

    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        Manager.sortByPrice(products);

    }

    public double getTotalPrice_Normal() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    
    public double getTotalPrice_Discounted() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getDiscountPrice();
        }
        return totalPrice;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void applyVoucher(Product product) {
        double price = product.getPrice();
        product.setDiscountPrice(0.7 * price);
    }

    public void applyDiscountThirdForFree() {
        if (products.size() == 3) {
            Product cheapest = Manager.findCheapestProduct(products);
            cheapest.setDiscountPrice(0);
        }
    }

    public void applyDiscountFivePercentFrom300$() {
        if (getTotalPrice_Normal() > 300) {
            for (Product product : products) {
                double price = product.getPrice();
                product.setDiscountPrice(0.95 * price);
            }
        }
    }

    public void applyDiscountExtraCupFrom200$() {
        if (getTotalPrice_Normal() > 200) {
            Product product = new Product();
            product.setCode("kubek");
            product.setName("Uber.Kubek");
            product.setPrice(0);
            products.add(product);
        }
    }
    
    public void applyDiscountFreePorshfrom500$() {
        if (getTotalPrice_Normal() > 500) {
            Product product = new Product();
            product.setCode("Porshe");
            product.setName("Porshe911");
            product.setPrice(0);
            product.setDiscountPrice(0);
            products.add(product);
        }
    }
    
    public void printCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

}