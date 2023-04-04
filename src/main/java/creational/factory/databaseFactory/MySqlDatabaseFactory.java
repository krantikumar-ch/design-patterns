package creational.factory.databaseFactory;

import creational.factory.connections.Connection;
import creational.factory.connections.MySqlConnection;
import creational.factory.queries.MySqlQuery;
import creational.factory.queries.Query;

public class MySqlDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }
}
