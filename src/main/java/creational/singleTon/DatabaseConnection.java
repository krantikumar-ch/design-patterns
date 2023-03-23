package creational.singleTon;

/**
 * Implement a Singleton class called "DatabaseConnection" in Java. The class should have the following features:
 *
 * A method void connect() to simulate connecting to the database
 * It should print Connected to the database.
 *
 * A method void executeQuery(String query) to simulate executing a query on the database
 * It should print Executing query: {query given in param}
 */
public class DatabaseConnection implements Cloneable{
    private static DatabaseConnection dbConnection = null;

    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        if(dbConnection == null){
            synchronized (DatabaseConnection.class){
                dbConnection = new DatabaseConnection();
            }
        }
        return dbConnection;
    }

    public void connect(){
        System.out.println("Connected to the database.");
    }

    public void executeQuery(String query){
        System.out.println("Executing query: "+query);
    }

    public DatabaseConnection clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("DatbaseConnection clone not supported");
    }
}
