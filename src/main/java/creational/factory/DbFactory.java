package creational.factory;

import creational.factory.databases.Database;
import creational.factory.databases.MongoDatabase;
import creational.factory.databases.MySqlDatabase;
import creational.factory.databases.PostGreSqlDatabase;

public class DbFactory {

    public static Database getDatabase(String type){
        if("mysql".equalsIgnoreCase(type))
            return new MySqlDatabase();

        if("mongodb".equalsIgnoreCase(type))
            return new MongoDatabase();

        return new PostGreSqlDatabase();
    }
}
