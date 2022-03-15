package bankaccount;
public class BankAccountepositoryImpl extends BankAccount implements BankAccountRepository{

	public BankAccountepositoryImpl(long accountId, String accountHolderName, String accountType,
			double accountBalance) {
		super(accountId, accountHolderName, accountType, accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		this.accountBalance=newBalance;
		return newBalance;
	}

	@Override
	public double getAccountBalance(long accountId) {
		return accountBalance;
	}

}
