class Account {
	private double balance;

	public Account(double balance){
		this.balance = balance;
	}

	public void deposit (double amnt){
		balance += amnt;
	}

	public void withdraw (double amnt){
		if(balance>= amnt) balance -= amnt;
	}

	public double getBalance(){
		return balance;
	}

	public static void main(String[] args){
		Account account = new Account(5000.00);
		account.deposit(2000.00);
		System.out.println("Balance: " + account.getBalance() );
		account.withdraw(4000.00);
		System.out.println("Balance: " + account.getBalance());
	}
}