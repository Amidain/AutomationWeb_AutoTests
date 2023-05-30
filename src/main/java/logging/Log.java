package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static Logger logger = LogManager.getLogger();


    public static void debug(String message) {
        logger.debug(message);
    }

    public static void debug(String message, Throwable throwable) {
        logger.debug(message, throwable);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void warn(String message) {
        logger.warn(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void fatal(final String message, Throwable throwable) {
        logger.fatal(String.format("%s: %s", message, throwable.toString()));
    }
}
