package javatpoint2;
 class HDFCBank{
	private String name = "Sudhakar";
	private long phnum = 9876543210L;
	private double bal = 5000.00;	
	public HDFCBank() {
		
		// TODO Auto-generated constructor stub
	}
	void displayMyInformation() {
		System.out.println("Name is: "+name);
		System.out.println("PhNum is: "+phnum);
		System.out.println("myBal is: "+bal);
	}
}
public class StringOverall {
	public static void main(String[] args) {		
		HDFCBank  sudhakar = new HDFCBank();   //object created
		//sudhakar.bal = 500000.00;
		sudhakar.displayMyInformation();
	}
}

