public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // 1. хэвийн
        acc.deposit(1000);

        // 2. сөрөг
        acc.deposit(-50);

        // 3. хэвийн
        acc.withdraw(200);

        // 4. хэт их
        acc.withdraw(5000);

        acc.getBalance();

        // Customer
        Customer c1 = new Customer("Bat", "bat@gmail.com");
        System.out.println(c1.getDomain());

        Customer c2 = new Customer("Bold", null);
        System.out.println(c2.getDomain());
    }
}