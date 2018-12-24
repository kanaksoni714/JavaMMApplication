class MMCurrentAccount extends CurrentAccount {
	public static final double creditLimit = 4000;

	public MMCurrentAccount(int AccountNumber, String Name, int AccountBalance) {
		super(AccountNumber, Name, AccountBalance);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void withdraw(int amount) throws Exception {
		if (amount+this.creditLimit() > 0)
			this.AccountBalance -= amount;
		else
			throw new Exception("Invalid Amount !");
	}


	@Override
	public String toString() {
		return "MMCurrentAccount [creditLimit()=" + creditLimit()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getName()="
				+ getName() + ", getAccountBalance()=" + getAccountBalance()
				+ "]";
	}

}