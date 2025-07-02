package Part4_1.Question7;

public class Main {
    public static void main(String[] args) {
        //Create a class named Product that represents a store product.
        //The product has the following attributes:
        //  price (double)
        //  quantity (int)
        //  name (String)
        //The class should have:
        //a constructor public Product(String initialName, double initialPrice, int initialQuantity)
        //a method public void printProduct() that prints the product information in this format:
        //Example:
        //Banana, price 1.1, 13 pcs

        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}
