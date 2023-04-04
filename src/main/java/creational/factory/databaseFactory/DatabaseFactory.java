package creational.factory.databaseFactory;

import creational.factory.connections.Connection;
import creational.factory.queries.Query;

public interface DatabaseFactory {
    Query createQuery();
    Connection createConnection();
}
