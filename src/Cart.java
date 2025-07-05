import java.util.*;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("Not enough stock for " + product.getName());
            return;
        }
        items.add(new CartItem(product, quantity));
        product.reduceStock(quantity);
    }

    public List<CartItem> getItems() {
        return items;
    }

    public float getSubtotal() {
        float sum = 0;
        for (CartItem item : items) {
            sum += item.getItemTotal();
        }
        return sum;
    }

    public float getTotalWeight() {
        float total = 0;
        for (CartItem item : items) {
            total += item.getItemWeight();
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}