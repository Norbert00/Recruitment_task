package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerManager {

    /*
        Class helps describe users steps in the browser. Each steps is printing to the console during the test.
     */


    private static Logger logger = LogManager.getRootLogger();

    public static void setLoggerInfo(String newInfo) {
        logger.info(newInfo);
    }

    public static void setLoggerInfo(String newInfo, String parameter) {
        logger.info(newInfo, parameter);
    }
}
