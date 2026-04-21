import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog {

    private static final Logger logger = LogManager.getLogger(TestLog.class);

    public static void main(String[] args) {

        logger.trace("TRACE message");
        logger.debug("DEBUG message");
        logger.info("INFO message");
        logger.warn("WARN message");
        logger.error("ERROR message");
        logger.fatal("FATAL message");

    }
}