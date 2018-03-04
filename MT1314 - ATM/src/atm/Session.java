package atm;

import java.util.ArrayList;

public class Session implements Countable {
	private ATM atm;
    private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Session(ATM atm) {
		this.setATM(atm);
	}

	public ATM getATM() {
		return atm;
	}

	public void setATM(ATM atm) {
		this.atm = atm;
	}

    public void addTransaction(Transaction t){
        this.transactions.add(t);
    }
    public int count(){
        return transactions.size();
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		if (atm == null) {
			if (other.atm != null)
				return false;
		} else if (!atm.equals(other.atm))
			return false;
		return true;
	}
	
	
	
}
