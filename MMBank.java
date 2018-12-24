public abstract class MMBank {
	private int AccountNumber;
	private String Name;
	protected int AccountBalance;
	public static final double MIN_BAL = 400;

	public MMBank(int AccountNumber, String Name, int AccountBalance) {
		this.AccountNumber = AccountNumber;
		this.Name = Name;
		this.AccountBalance = AccountBalance;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public int getAccountBalance() {
		return AccountBalance;
	}

	public abstract void withdraw(int amount) throws Exception;

	public void deposit(double amount) throws Exception {
		if (amount > 0)
			this.AccountBalance += amount;
		else
			throw new Exception("Invalid Amount !");
	}

	public String toString() {
		return "MMBank [AccountNumber=" + AccountNumber + ", Name=" + Name
				+ ", AccountBalance=" + AccountBalance + "]";
	}

}







