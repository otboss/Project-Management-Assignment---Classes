package classes.pizza_factory_locator_subsystem;

import classes.Location;
import classes.Order;

public abstract class PizzaLocator {
    /**
     * Determines the ideal location to place a new Pizza Factory based on previous
     * pizza orders. This function also accounts for the time when the pizza order
     * was placed and the traffic in the vicinity around that time.
     */
    public static Location[] determinePizzaFactoryLocations(Order[] orders) {
        return null;
    }
}