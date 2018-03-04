package atm;

public class Withdrawal extends Transaction {
	public Withdrawal (ATM atm, Session session, Card card, double amount) {
		super(atm, session, card, amount);
	}
	
@Override
public String toString() {

    String s = "Withdrawal at ATM " + super.getAtm().getID() + " (" + super.getAtm().getName() + ", " +
            super.getAtm().getBank() + ") of " + String.format("%.2f", super.getAmount());

    return s;
}
}