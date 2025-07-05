public class Product implements Shippable {
    private String name;
    private int stock;
    private float price;
    private float weight;
    private boolean expired;
    private boolean shippable;

    public Product(String name, int stock, float price, boolean expired, boolean shippable, float weight) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.expired = expired;
        this.shippable = shippable;
        this.weight = shippable ? weight : 0;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public float getPrice() {
        return price;
    }

    public boolean isExpired() {
        return expired;
    }

    public boolean isShippable() {
        return shippable;
    }

    public float getWeight() {
        return weight;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }
}
