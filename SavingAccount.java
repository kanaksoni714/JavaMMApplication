abstract class SavingAccount extends MMBank {
	public SavingAccount(int AccountNumber, String Name, int AccountBalance) {
		super(AccountNumber, Name, AccountBalance);
		// TODO Auto-generated constructor stub
	}

	private boolean isSalaried;
	public boolean isSalaried() {
		return isSalaried;
	}

	public abstract void withdraw(int amount) throws Exception;
	
	

}