package utils;
import java.util.Properties;


/**
 * Class with data which are used in tests
 */
public class Config {

//    private static final String PROPERTIES_LOCATION = "config.properties";
    private static Properties prop = new Properties();

    static {
        try {
            prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        } catch (Exception e) {
            throw new RuntimeException("Unknown exception during load properties file");
        }
    }
        
//    public static String baseUrl = prop.getProperty("baseUrl");
    public static boolean headless = Boolean.valueOf(prop.getProperty("headless"));
    public static String browser = String.valueOf(prop.getProperty("browser"));
     
}
