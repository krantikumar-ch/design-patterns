package creational.singleTon;

import java.io.*;
import java.util.Properties;

/**
 * Design a Singleton class called "ConfigurationManager" to store application settings.
 * The class should have the following features:
 *
 * A method void loadConfigurationFromFile(String filePath) throws IOException to load configuration settings from a file
 * A sample configuration file shall be as follows:
 *
 *  key1=value1
 *  key2=value2
 * Methods to get and set configuration settings String getSetting(String key) void setSetting(String key, String value)
 *
 * A method void saveConfigurationToFile(String filePath) throws IOException that stores configuration in the file as above.
 *
 * Hint: Use java.util.Properties to implement above.
 */
public class ConfigurationManager implements Cloneable{
    private static ConfigurationManager configurationManager;

    private final Properties settings;

    private ConfigurationManager(){
        this.settings = new Properties();
    }

    public static ConfigurationManager getInstance(){
        if(configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void loadConfigurationFromFile(String filePath) throws IOException{
        try(FileInputStream fis = new FileInputStream(filePath)){
            settings.load(fis);
        }

    }

    public String getSetting(String key){
        return settings.getProperty(key);
    }

    public void setSetting(String key, String value){
        settings.setProperty(key, value);
    }

    public void saveConfigurationToFile(String filePath) throws IOException{
        try(FileOutputStream out  = new FileOutputStream(filePath);){
            settings.store(out,"Settings saved");
        }

    }

    public ConfigurationManager clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException(" Clone not supported");
    }

}
