import java.util.Stack;


public class sampleStack<T> {

	public Stack<T> stack = new Stack<T>();
	//public <T> sampleStack() {
		// TODO Auto-generated constructor stub
		 //stack = new Stack();
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleStack <Integer>s1 = new sampleStack<Integer>();
		s1.stack.push(0);
		System.out.println(s1.stack.peek());

	}

}
