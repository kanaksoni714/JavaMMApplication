
public class MMBankFactory extends BankFactory{
	@Override
	public MMSavingAccount getNewSavingAccount(int AccountNumber,String name,int AccountBalance,boolean isSalried) {
		 MMSavingAccount mmsavingaccount=new MMSavingAccount(100000,null,2000);
		return mmsavingaccount; 
	}

	@Override
public MMCurrentAccount getNewCurrentAccount(int AccountNumber,
			String name, int AccountBalance, int creditLimit) {
		MMCurrentAccount mmcurrentaccount=new MMCurrentAccount(100000,null,2000);
			return mmcurrentaccount; 
	}
	
}
