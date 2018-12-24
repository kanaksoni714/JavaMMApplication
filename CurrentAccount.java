abstract class CurrentAccount extends MMBank {
	public CurrentAccount(int AccountNumber, String Name, int AccountBalance) {
		super(AccountNumber, Name, AccountBalance);
		// TODO Auto-generated constructor stub
	}
	private float creditLimit;
	

	public float creditLimit() {
		return creditLimit;
	}

	
	
	public abstract void withdraw(int amount) throws Exception;
	

}