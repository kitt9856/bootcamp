
import java.util.Arrays;

public class Cart {//cart,可以new Cart() -> not an abstract class

    private Product[] products;
    private int count;

    public Cart() {
        this.products = new Product[0];  //array is fixed length, so declare the length
        this.count = 0;
    }

    public void addProduct(Product product) {
        Product[] newCart = Arrays.copyOf(products, products.length + 1);
        if (this.count < newCart.length) {
            products[count++] = product;
            this.products = newCart; //array pass by reference
        } else {
            System.out.println("Cart is full , cannot add more products.");
        }
    }

    public void removeProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            //we dont use == to compare ogject
            //approach a, products[i] maybe null
            //if(product[i].equals(product)) -> array0 會爆

            if (product.equals(this.products[i])) {
                for (int j = i; j < this.count - i; j++) {
                    this.products[j] = this.products[j + 1];

                }
                this.products[this.count - 1] = null;
                this.count--;
                return;
            }

        }


    

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : this.products) {
            total += product.price();
        }
        return total;
    }

    public void showCart() {
        for (int i = 0; i < this.products.length; i++) {
            System.out.println(products[i].name()
                   + "(" + products[i].getProductType() + ") - $"
                   + this.products[i].price());
        }
    }

}

//cart cartA = new Cart();
//cartA.addProduct(product);
//cartA.removeProduct(product);
}
