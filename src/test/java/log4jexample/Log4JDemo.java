package log4jexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JDemo {

    public static Logger logger = LogManager.getLogger(Log4JDemo.class);

    @Test
    public void checkingTheLog(){
        System.out.println("Hello word");
        logger.info("This is an information message");
        logger.trace("This is a trace message");
        logger.error("This is an error message");
        logger.warn("This is a warn message");
        logger.fatal("This is a fetal message");
        System.out.println("Complete");
    }
}
