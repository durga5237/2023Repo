import java.util.Stack;

public class java04Stack {
//pop -lastone  peak-firstone  search -position from last to first  empty-empty r not 
	//only posiible in single direction -disadvantage
	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.push("durga");
		st.push("durga01");
		st.push("durga02");
		st.push("durga03");
		for (int i = st.size()-1;i>=0; i--) {
			if (st.empty()) {
				System.out.println("stock is empty");
			} else {
				System.out.println("the stock is :" + st.peek());
			}

		}
	}
}
