package classes.database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import classes.Order;

/**
 * The interface for the database. All interactions with the database should be
 * done through this class the minimize the risk of errors. Only one instance of
 * this class should exist which is why it is made abstract.
 */
public abstract class Database {
    /**
     * The MongoClient class included from the mongodb driver jar file. Establishes
     * a connection to the mongo database server.
     */
    private static MongoClient mongo = new MongoClient("localhost", 27017);

    /**
     * An established connection to the mongo database.
     */
    private static MongoDatabase database = mongo.getDatabase("pdq");

    /** Fetches all pizza orders from the orders collection in the database */
    public static Order[] getOrders() {
        return null;
    }
}