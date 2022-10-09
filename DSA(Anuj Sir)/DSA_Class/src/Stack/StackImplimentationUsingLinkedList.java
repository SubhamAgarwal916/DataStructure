package Stack;

public class StackImplimentationUsingLinkedList {
	class node{
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
		}
	}
	node head;
	int size=0;
	
	void push(int entry) {
		node newNode=new node(entry);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	int pop() throws Exception{
		if(head==null) throw new Exception("Empty Stack");
		int ans=head.data;
		head=head.next;
		size--;
		return ans;
	}
	
	int peek() throws Exception{
		if(head==null) throw new Exception("Empty Stack");
		return head.data;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return head==null;
	}
}

