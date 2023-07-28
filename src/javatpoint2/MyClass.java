package javatpoint2;

	class FirstProg {
		void m1() {
			System.out.println("This is m1 method");
		}
		int m2(String integer[],boolean character) {
			System.out.println("This is m2 method");
			return 10;
		}	
		String[] m3(int bool,char dbl[]) {
			System.out.println("This is m3 method");
			String arr[] = {"HYD","MUM","DEL"};
			return arr;
		}	
	}
	public class MyClass {
		public static void main(String[] args) {
			FirstProg fp = new FirstProg();
			fp.m1();
			
			
			String s[] = {"MUM","DEL"};
		int abc=fp.m2(s,true);
			
			
			System.out.println(abc);	
			
			char ssd[] = {'A','B','C'};
		    String mno[] = fp.m3(100, ssd);
		    for(String b:mno) {
		    	System.out.println(b);
		    }
		}
	}
