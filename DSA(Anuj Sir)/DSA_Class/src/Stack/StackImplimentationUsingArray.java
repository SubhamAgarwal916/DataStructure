package Stack;

public class StackImplimentationUsingArray {
	int top;
	int a[];
	int capacity;
	
	public StackImplimentationUsingArray(int capacity) {
		this.top = -1;
		this.a = new int[capacity];
		this.capacity = capacity;
	}
	
	void push(int entry) throws Exception{
		top++;
		if(top==capacity)throw new Exception("Out of bound");
		else a[top]=entry;
	}
	
	int pop()throws Exception{
		if(top==-1)throw new Exception("Empty stack");
		else return(a[top--]);
	}
	int peek()throws Exception{
		if(top==-1)throw new Exception("Empty stack");
		else return(a[top]);
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return top==-1;
	}
}
