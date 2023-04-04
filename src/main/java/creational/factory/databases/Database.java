package creational.factory.databases;

import creational.factory.databaseFactory.DatabaseFactory;

public interface Database {
    void connect();
    void shutdown();
    void restart();
    DatabaseFactory createDatabaseFactory();
}
