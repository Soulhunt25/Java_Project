package encapulation;

class Atm {
	public String name;
	private long accNo;
	private int pin;

	public Atm(String name, long accNo, int pin) {
		this.name = name;
		this.setAccNo(accNo);
		this.setPin(pin);
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}

public class Bank {
	public static void main(String[] args) {

		Atm as = new Atm("Pranjal", 321684, 1234);

		System.out.println("Name : " + as.name);
		System.out.println("Account No. : " + as.getAccNo());
		System.out.println("Account Pni : " + as.getPin());

	}
}