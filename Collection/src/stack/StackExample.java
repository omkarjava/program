package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
        st.push(20);
        st.push(2);
        st.push(200);
        st.push(105);
        st.push(8);
        st.push(28);
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		System.out.println(st.contains(20));//vector used
		
		System.out.println(st.peek());//top element in your stack
		
		System.out.println(st.empty());
		
		System.out.println(st.search(28));//position of the element from top
		
	}

}
