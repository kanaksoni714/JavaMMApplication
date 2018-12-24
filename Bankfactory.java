abstract class BankFactory{
	
	public abstract MMSavingAccount getNewSavingAccount(int AccountNumber,String name,int AccountBalance,boolean isSalried);
	
	public abstract MMCurrentAccount getNewCurrentAccount(int AccountNumber,String name,int AccountBalance,int creditLimit);

}
