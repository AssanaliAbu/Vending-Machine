package kz.edu.nu.cs.se;


public class IdleState extends State {

	



	public IdleState(VendingMachine vendingMachine) {
		// TODO Auto-generated constructor stub
		super.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(int coin) {
		
		super.vendingMachine.setCurrentState(super.vendingMachine.enteringCoins);
		super.vendingMachine.insertCoin(coin);
		
		// TODO Auto-generated method stub

	}

	@Override
	public int refund() {
		// TODO Auto-generated method stub
	return 0;
	
	
	}

	@Override
	public int vend() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("not the right state");
		
	}

}
