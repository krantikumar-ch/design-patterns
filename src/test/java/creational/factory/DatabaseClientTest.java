package creational.factory;

import creational.factory.connections.Connection;
import creational.factory.connections.MongoConnection;
import creational.factory.connections.MySqlConnection;
import creational.factory.connections.PostGreConnection;
import creational.factory.databaseFactory.DatabaseFactory;
import creational.factory.databaseFactory.MongoDatabaseFactory;
import creational.factory.databaseFactory.MySqlDatabaseFactory;
import creational.factory.databaseFactory.PostGreDatabaseFactory;
import creational.factory.databases.Database;
import creational.factory.databases.MongoDatabase;
import creational.factory.databases.MySqlDatabase;
import creational.factory.databases.PostGreSqlDatabase;
import creational.factory.queries.MongoDbQuery;
import creational.factory.queries.MySqlQuery;
import creational.factory.queries.PostGreQuery;
import creational.factory.queries.Query;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseClientTest {
    private DatabaseClient dbClient = new DatabaseClient();

    @Test
    void getMySQLDatabase() {
        Database db = dbClient.getDatabase("mysql");
        DatabaseFactory dbf = db.createDatabaseFactory();
        Query query = dbf.createQuery();
        Connection conn = dbf.createConnection();
        assertTrue(db instanceof MySqlDatabase);
        assertTrue(dbf instanceof MySqlDatabaseFactory);
        assertTrue(query instanceof MySqlQuery);
        assertTrue(conn instanceof MySqlConnection);
    }

    @Test
    void getMongoDatabase() {
        Database db = dbClient.getDatabase("mongodb");
        DatabaseFactory dbf = db.createDatabaseFactory();
        Query query = dbf.createQuery();
        Connection conn = dbf.createConnection();
        assertTrue(db instanceof MongoDatabase);
        assertTrue(dbf instanceof MongoDatabaseFactory);
        assertTrue(query instanceof MongoDbQuery);
        assertTrue(conn instanceof MongoConnection);
    }

    @Test
    void getPostGreDatabase() {
        Database db = dbClient.getDatabase("postgre");
        DatabaseFactory dbf = db.createDatabaseFactory();
        Query query = dbf.createQuery();
        Connection conn = dbf.createConnection();
        assertTrue(db instanceof PostGreSqlDatabase);
        assertTrue(dbf instanceof PostGreDatabaseFactory);
        assertTrue(query instanceof PostGreQuery);
        assertTrue(conn instanceof PostGreConnection);
    }
}