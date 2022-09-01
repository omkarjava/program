package collection;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<Integer> stk= new Stack<>();  
		
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		stk.push(90);  
		stk.push(null);
		stk.push(787);
		stk.add(null);
		stk.add(878);
		stk.pop();
		stk.pop();
		
		System.out.println(stk);

	}

}
