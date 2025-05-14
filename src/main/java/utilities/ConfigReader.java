package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // This object will hold all properties loaded from the configuration file
    private static Properties properties;

    static {
        try {
            //Path to the configuration file
            String path = "configuration.properties";

            //Open the file as an input stream
            FileInputStream input = new FileInputStream(path);

            //Initialize the properties object
            properties = new Properties();

            //Load the properties from the file
            properties.load(input);

            //Close the input stream
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
