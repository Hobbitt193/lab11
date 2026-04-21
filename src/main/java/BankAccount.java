import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccount {

    private static final Logger logger = LogManager.getLogger(BankAccount.class);

    private double balance;

    public void deposit(double amount) {
        logger.trace("Entering deposit() amount={}", amount);

        if (amount < 0) {
            logger.warn("Invalid amount: {}", amount);
            return;
        }

        logger.debug("Before deposit balance={}", balance);

        balance += amount;

        logger.info("Deposited {} new balance={}", amount, balance);

        logger.trace("Exiting deposit()");
    }

    public void withdraw(double amount) {
        logger.trace("Entering withdraw() amount={}", amount);

        if (amount < 0) {
            logger.warn("Negative withdraw: {}", amount);
            return;
        }

        if (amount > balance) {
            logger.error("Not enough balance! balance={} amount={}", balance, amount);
            return;
        }

        logger.debug("Before withdraw balance={}", balance);

        balance -= amount;

        logger.info("Withdraw {} new balance={}", amount, balance);

        logger.trace("Exiting withdraw()");
    }

    public double getBalance() {
        logger.trace("Entering getBalance()");
        logger.debug("Current balance={}", balance);
        return balance;
    }
}