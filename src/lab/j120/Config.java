package lab.j120;

import java.io.*;
import java.util.Properties;

public class Config {

    private static Config instance;
    public static Config getInstance() throws IOException {
        if (instance == null) {
            try {
                instance = new Config();
            }
            catch (IOException e) {
                System.out.println("Unable to load properties");
                System.exit(1);
            }
        }
        return instance;
    }

    private Config() throws FileNotFoundException, IOException {
        Properties defaultProperties = new Properties();
        try {
            defaultProperties.load(new FileInputStream("D:\\All\\!Project\\Lab-J120\\src\\Config\\application.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        properties = new Properties(defaultProperties);
        try {
            properties.load(new FileInputStream("D:\\All\\!Project\\Lab-J120\\src\\Config\\user.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    private Properties properties;
    public Properties getProperties() {
        return properties;
    }

}
