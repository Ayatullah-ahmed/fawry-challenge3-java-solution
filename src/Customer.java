public class Customer {
    private String name;
    private float balance;

    public Customer(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public void deduct(float amount) {
        balance -= amount;
    }
}
