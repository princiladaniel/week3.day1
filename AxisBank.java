package Week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println(depo);
}
public void saving() {
	System.out.println(save);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank bank=new AxisBank();
bank.deposit();
bank.saving();

	}
	

}

/*Assignment3:
============
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.*/