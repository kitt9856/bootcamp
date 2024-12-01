public class ECommerceApp {
    public static void main(String[] args) throws Exception {
        Electronics macBookPro - new Electronics("macBookPro", 499, 5);
        Clothing shirt = new Clothing("shirt", 10,"L", "Cotton");

        System.out.println("macBookPro" + macBookPro);
        System.out.println("shirt" + shirt);

        Cart CartA = new Cart();
        CartA.addProduct(shirt);





    }
}
