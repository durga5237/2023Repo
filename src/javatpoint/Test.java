package javatpoint;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
	@Autowired
	private static Durga durgaa;

	public static void main(String[] args) {

		String durga = "katakatla durga prasad";
		for (int i = durga.length() - 1; i >= 0; i--) {

			System.out.println(durga.charAt(i));
			Test t=new Test();
			t.durga();
			t.prasad();
			try {
				durgaa.add();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

	public void durga() {
		System.out.println("katakatla durga prasad");
	}
	
	public void prasad() {
		System.out.println("katakatla durga prasad durga");
	}


}
