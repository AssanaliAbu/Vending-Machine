package kz.edu.nu.cs.se;

public class EnteringCoinsState extends State {



	public EnteringCoinsState(VendingMachine vendingMachine) {
		// TODO Auto-generated constructor stub
		super.vendingMachine = vendingMachine;

	}

	@Override
	public void insertCoin(int coin) {
		if(coin != 50 && coin !=100) {
    		throw new IllegalArgumentException("not the right coin");
    	}
    	else {
    		super.vendingMachine.balance = super.vendingMachine.balance + coin;
    	}
        if(super.vendingMachine.getBalance() >=200) {
        	super.vendingMachine.setCurrentState(super.vendingMachine.paid);
        }
		// TODO Auto-generated method stub

	}

	@Override
	public int refund() {
		// TODO Auto-generated method stub
		int temp = super.vendingMachine.balance;
		super.vendingMachine.balance = 0;
		super.vendingMachine.setCurrentState(super.vendingMachine.idle);
    	return temp;		
	}

	@Override
	public int vend() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("not the right state");
		
	}

}
