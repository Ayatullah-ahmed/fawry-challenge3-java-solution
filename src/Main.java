public class Main {
    public static void main(String[] args) {
        Product cheese = new Product("Cheese", 10, 100, false, true, 200);
        Product biscuits = new Product("Biscuits", 5, 150, false, true, 700);
        Product scratchCard = new Product("Scratch Card", 10, 50, false, false, 0);

        Customer customer = new Customer("John", 500);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        Checkout checkout = new Checkout();
        checkout.process(customer, cart);
    }
}
