package modul.main;

import modul.products.Cart;
import modul.products.Product;

public class Main {
    public static void main(String[] args) {
    	

    	
    	// Nowe produkty
    	
    	Product product1 = new Product("code1", "produkt1", 200);
    	Product product3 = new Product("code3", "produkt3", 110);
    	Product product2 = new Product("code2", "produkt2", 450);
    
        //Nowy koszyk
        Cart cart = new Cart();
        
        // Wyswietlamy przed edycjami, zni¿kami
        System.out.println("Before discount: ");
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.printCart();
        
        
        // Wyswietlamy po sortowaniu, zni¿kach
        System.out.println("After discount: ");
        cart.applyDiscountExtraCupFrom200$();
        cart.applyDiscountFivePercentFrom300$();
        cart.applyDiscountFreePorshfrom500$();
        cart.applyDiscountThirdForFree();
        cart.printCart();
        System.out.println("£¹czna cena: "+cart.getTotalPrice_Normal());
        System.out.println("£¹czna cena po obni¿ce: "+cart.getTotalPrice_Discounted());

        
        
    }
}