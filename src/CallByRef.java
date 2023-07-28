
public class CallByRef {

	int myself;
	int others;

	void callBy(CallByRef cb) {
		cb.myself = 100;
		cb.others = 200;

	}

	public static void main(String[] args) {

		CallByRef cb = new CallByRef();
		cb.myself = 20;
		cb.others = 30;
		System.out.println(cb.myself + cb.others);
		cb.callBy(cb);
		System.out.println(cb.myself + cb.others);

	}

}
