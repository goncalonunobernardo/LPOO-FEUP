package atm;

public class Deposit extends Transaction{

    public Deposit(ATM atm, Session session, Card card, double amount) {
        super(atm, session, card, amount);
    }
}
