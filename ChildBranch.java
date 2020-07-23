package day3;

public class ChildBranch  extends Bank implements BankFunction{
	public ChildBranch(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void increment(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount+=amt;
		System.out.println("Your increased balance:"+totalAmount);
		
	}

	@Override
	public void decrement(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount-=amt;
		System.out.println("Your decreased balance:"+totalAmount);
		
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method
		
		ChildBranch cb=new ChildBranch(10000);
		cb.increment(10000);
		cb.decrement(5000);
		
	}

}
