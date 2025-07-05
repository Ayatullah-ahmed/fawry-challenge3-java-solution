import java.util.*;

public class Checkout {
    public void process(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        List<Shippable> shippableItems = new ArrayList<>();
        for (CartItem item : cart.getItems()) {
            if (item.getProduct().isExpired()) {
                System.out.println("Product " + item.getProduct().getName() + " is expired.");
                return;
            }
            if (item.getProduct().isShippable()) {
                shippableItems.add(item.getProduct());
            }
        }

        float subtotal = cart.getSubtotal();
        float shipping = shippableItems.isEmpty() ? 0 : 30;
        float total = subtotal + shipping;

        if (customer.getBalance() < total) {
            System.out.println("Insufficient balance.");
            return;
        }

        if (!shippableItems.isEmpty()) {
            ShippingService.ship(shippableItems);
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName() + " " + (int) item.getItemTotal());
        }
        System.out.println("Subtotal " + (int)subtotal);
        System.out.println("Shipping " + (int)shipping);
        System.out.println("Amount " + (int)total);

        customer.deduct(total);
        System.out.println("Customer balance after payment: " + (int)customer.getBalance());
    }
}