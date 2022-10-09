package Stack;

public class Stack {

	public static void main(String[] args) throws Exception {
		//Stack implementation using Array
		StackImplimentationUsingArray stack=new StackImplimentationUsingArray(2);
		//Stack implementation using LinkedList
//		StackImplimentationUsingLinkedList stack= new StackImplimentationUsingLinkedList();
		stack.push(2);
		stack.push(4);
//		stack.push(6);
		
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		
		
		
		
		
	}

}
