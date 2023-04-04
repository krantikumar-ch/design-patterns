package creational.factory.databaseFactory;

import creational.factory.connections.Connection;
import creational.factory.connections.PostGreConnection;
import creational.factory.queries.PostGreQuery;
import creational.factory.queries.Query;

public class PostGreDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new PostGreQuery();
    }

    @Override
    public Connection createConnection() {
        return new PostGreConnection();
    }
}
