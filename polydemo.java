package opps;

public class polydemo {

	public static void main(String[] args) {
		Bank myBank = new Bank();
		Bank mySBI = new SBI();
		Bank myICIC = new ICIC();
		myBank.bankdetails();
		((SBI) mySBI).sbidetails();
		((ICIC) myICIC).icicdetails();
		}

}
class Bank
{
	public void bankdetails() {
		System.out.println("bank details are printed: 1234");
		
	}
}
class SBI extends Bank{
	public void sbidetails() {
		System.out.println("sbi details are printed:2345");
		
	}
} 
class ICIC extends Bank{
	public void icicdetails() {
		System.out.println("icic details are printed:34567");
		
	}
}
