package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class LoggerUtils {
    private static final Logger logger = LogManager.getLogger(LoggerUtils.class.getName());

    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void warn(String message, Exception e) {
        logger.warn(message, e);
    }

    public void error(String message, Throwable throwable) {
        logger.error(message);
        logger.error(Arrays.toString(throwable.getStackTrace()));
    }
}
