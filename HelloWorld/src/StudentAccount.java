
public class StudentAccount extends BankAccount{

	public StudentAccount(String accnum, Double bal) {
		super(accnum, bal);
		// TODO Auto-generated constructor stub
	}
	private Double overdraft;
	
	public StudentAccount(String accnum, Double bal, Double od) {
		System.out.println("Creating...");
		super(accnum, bal);
		
		this.overdraft = od;
	}

	@Override
	public String toString() {
		return "StudentAccount [overdraft=" + overdraft + ", accnum=" + accnum + ", balance=" + balance
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	


}
