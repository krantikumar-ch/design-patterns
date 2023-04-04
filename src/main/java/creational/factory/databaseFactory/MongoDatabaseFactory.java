package creational.factory.databaseFactory;

import creational.factory.connections.Connection;
import creational.factory.connections.MongoConnection;
import creational.factory.queries.MongoDbQuery;
import creational.factory.queries.Query;

public class MongoDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MongoDbQuery();
    }

    @Override
    public Connection createConnection() {
        return new MongoConnection();
    }
}
