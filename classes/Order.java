package classes;

public class Order {
    public Pizza pizza;
    public Customer customer;
    public Location location;

    Order(Pizza pizza, Customer customer, Location location) {
        this.pizza = pizza;
        this.customer = customer;
        this.location = location;
    }
}