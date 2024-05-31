package JavaFiles;

public class CreditCardDemo {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000);
        final Money FIRST_AMOUNT = new Money(200);
        final Money SECOND_AMOUNT = new Money(10.02);
        final Money THIRD_AMOUNT = new Money(25);
        final Money FOURTH_AMOUNT = new Money(990);

        Person owner = new Person("Christie", "Diane", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
        
        CreditCard visa = new CreditCard(owner, LIMIT);

        System.out.println(visa.getPersonals()); // Diane Christie, 237J Harvey Hall, Menomonie, WI 54751
        System.out.println("Balance: " + visa.getBalance()); // Balance: $0.00
        System.out.println("Credit Limit: " + visa.getCreditLimit()); // Credit Limit: $1000.00
        System.out.println();

        System.out.println("Attempt to charge " + FIRST_AMOUNT); // Attempt to charge $200.00
        visa.charge(FIRST_AMOUNT); // Charge: $200.00
        System.out.println("Balance: " + visa.getBalance()); // Balance: $200.00

        System.out.println("Attempt to charge " + SECOND_AMOUNT); // Attempt to charge $10.02
        visa.charge(SECOND_AMOUNT); // Charge: $10.02
        System.out.println("Balance: " + visa.getBalance()); // Balance: $210.02

        System.out.println("Attempt to pay " + THIRD_AMOUNT); // Attempt to pay $25.00
        visa.payment(THIRD_AMOUNT); // Payment: $25.00
        System.out.println("Balance: " + visa.getBalance()); // Balance: $185.02

        System.out.println("Attempt to charge " + FOURTH_AMOUNT); // Attempt to charge $990.00
        visa.charge(FOURTH_AMOUNT); // Exceeds credit limit
        System.out.println("Balance: " + visa.getBalance()); // Balance: $185.02
    }
}
