import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer {

    private static final Logger logger = LogManager.getLogger(Customer.class);

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getDomain() {

        logger.trace("Entering getDomain()");
        logger.debug("Email={}", email);

        if (email == null) {
            logger.error("Email is NULL!");
            return "UNKNOWN";
        }

        if (!email.contains("@")) {
            logger.warn("Invalid email format: {}", email);
            return "INVALID";
        }

        String domain = email.substring(email.indexOf("@") + 1).toUpperCase();

        logger.info("Domain extracted={}", domain);

        return domain;
    }
}