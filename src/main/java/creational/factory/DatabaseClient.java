package creational.factory;

import creational.factory.databases.Database;

/**
 * create a database object. This database object connects with mysql, oracle, postgre
 * It has methods
 * createConnect() return database connection object
 * createQuery() return database query
 * connect() connect with database
 *
 */
public class DatabaseClient {

    public Database getDatabase(String type){
        return DbFactory.getDatabase(type);
    }
}
