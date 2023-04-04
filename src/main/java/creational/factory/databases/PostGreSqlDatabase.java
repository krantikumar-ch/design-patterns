package creational.factory.databases;

import creational.factory.databaseFactory.DatabaseFactory;
import creational.factory.databaseFactory.PostGreDatabaseFactory;

public class PostGreSqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println(this.getClass().getName()+" db connected");
    }

    @Override
    public void shutdown() {
        System.out.println(this.getClass().getName()+" db closed");
    }

    @Override
    public void restart() {
        System.out.println(this.getClass().getName()+" db restarted");
    }

    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostGreDatabaseFactory();
    }
}
