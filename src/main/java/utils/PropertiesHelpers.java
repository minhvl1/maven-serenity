
package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Properties;

public class PropertiesHelpers {




        public static String getEnvironment(String key)  {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream input = classloader.getResourceAsStream("application.properties");
            final Properties properties = new Properties();
            try {
                properties.load(input);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return properties.getProperty(key);
        }



}
