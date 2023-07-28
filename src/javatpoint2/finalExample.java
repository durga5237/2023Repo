package javatpoint2;

class finalExample {
	public static void main(String[] args) {

   final int AGE=30;
   
   
  System.out.println(AGE);
  char  ch  = 'A';
	int   i =  ch;
	System.out.println(i);
	
	int   j =  66;
	char  c  = (char) j;		
	System.out.println(c);
	int a=10;
	int b=15;
	if(a>b) {
		System.out.println("1");
		
	}else if(a>b){
		System.out.println("2");

	}else if(a==b){
		System.out.println("3");

	}else if(a<b){
	System.out.println("4");
	for(int x=1;x<=10;x++) {
		if(x>5) {
			continue;				
		}
		System.out.println(x);
	}	
	
	for(int i1=1;i1<=10;i1++) {
		if(i1>5) {
			break;
		}
		System.out.println(i1);
	}


}
	
	
			}

}
