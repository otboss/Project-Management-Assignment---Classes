/**
 * The interface for the database. All interactions with the database should be
 * done through this class the minimize the risk of errors. Only one instance of
 * this class should exist which is why it is made abstract.
 */
abstract class Database {

    /**
     * Call this method before any other. Establishes a connection to the database.
     */
    public static void init() {

    }
}