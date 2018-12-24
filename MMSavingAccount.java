class MMSavingAccount extends SavingAccount {

	public MMSavingAccount(int AccountNumber, String Name, int AccountBalance) {
		super(AccountNumber, Name, AccountBalance);
		// TODO Auto-generated constructor stub
	}



	public int getMIN_BAL1() {
		return 400;
	}

	

	@Override
	public void withdraw(int amount) throws Exception {
		super.deposit(-amount);
	}


	
	@Override
	public String toString() {
		return "MMSavingAccount [getMIN_BAL()=" + getMIN_BAL1()
				+ ", isSalaried()=" + isSalaried() + ", getAccountNumber()="
				+ getAccountNumber() + ", getName()=" + getName() + "]";
	}

	

}