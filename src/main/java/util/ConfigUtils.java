package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
    private final Properties properties;
    LoggerUtils logger = new LoggerUtils();

    public ConfigUtils(String configFilePath) {
        properties = new Properties();
        try (InputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException ex) {
            logger.warn("Failed to load properties from " + configFilePath, ex);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

