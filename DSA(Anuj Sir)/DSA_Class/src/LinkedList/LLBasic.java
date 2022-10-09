package LinkedList;

public class LLBasic {
	
	//Print LinkedList
	static void printL(node head) {
		node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+" -> ");
			cur=cur.next;
		}
		System.out.print("end");
		System.out.println("");
		
	}
	
	//Insert a new node to LL
	
	static node insertL(int data,int pos,node head) {
		node newNode=new node(data);
		if(pos==0) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		node cur=head;
		for(int i=0;i<pos-1;i++) {
			cur=cur.next;
		}
		newNode.next=cur.next;
		cur.next=newNode;
		return head;
	}
	
	//Delete a node from a LL
	
	 static node deleteL(int pos,node head) {
		 if(head==null)return null;
		 if(pos==0) {
			 head=head.next;
			 return head;
		 }
		 node cur=head;
		 for(int i=0;i<pos-1;i++) {
			 cur=cur.next;
		 }
		 cur.next=cur.next.next;
		 return head;
	 }
	
	 
	 //Find the Middle Element in a LL
	 
	 static node findMidElement(node head) {
		 node slow=head;
		 node fast=head;
		 while(fast!=null && fast.next!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 node mid=slow;
		 return mid;
	 }
	 
	 
	 //Reverse a LL
	 
	 static node reverseL(node head) {
		 node cur=head;
		 node prev=null;
		 while(cur!=null) {
			 node temp=cur.next;
			 cur.next=prev;
			 prev=cur;
			 cur=temp;
		 }
		 return prev;
	 }
	 
	 //Reverse a LL using recursion
	 
	 static node reverseRecursionL(node head) {
		 if(head==null || head.next==null)return head;
		 node temp=head.next;
		 node reverseHead=reverseRecursionL(head.next);
		 temp.next=head;
		 head.next=null;
		 
		 return reverseHead;
	 }
	 //Reverse first k elements of a LL
	 
	 static node reversePosL(node head,int pos) {
		 
		 if(pos==0 || head==null || head.next==null)return head;
		 node temp=head.next;
		 node reverseHead=reversePosL(head.next,pos-1);
		 node temp2=head.next.next;
		 temp.next=head;
		 head.next=temp2;
		 return reverseHead;
	 }
	 
	 
	 //Reverse a linked list in a group of k
	 
	 static node reverseInGroupOfK(node head, int k) {
		 node cur=head;
		 node newHead=null;
		 node prevFirst=null;
		 while(cur!=null) {
			 int count =0;
			 node first=cur,prev=null;
			 while(cur!=null && count<k) {
				 node temp=cur.next;
				 cur.next=prev;
				 prev=cur;
				 cur=temp;
				 count++;
			 }
			 
			 if(newHead==null) {
				 newHead=prev;
			 }
			 else {
				 prevFirst.next=prev;
			 }
			 prevFirst=first;
		 }
		 return newHead;
	 }
	 
	 // Merge two sorted LL(in place)
	 
	 static node mergeL(node h1,node h2) {
		 if(h1==null)return h2;
		 if(h2==null)return h1;
		 node head=h1;
		 node tail=h1;
		 node a=h1;
		 node b=h2;
		 if(a.data<=b.data) {
			 head=a;
			 tail=a;
			 a=a.next;
		 }
		 else{
			 head=b;
			 tail=b;
			 b=b.next;
		 }
		 while(a!=null && b!=null) {
			 if(a.data<=b.data) {
				 tail.next=a;
				 tail=a;
				 a=a.next;
			 }
			 else {
				 tail.next=b;
				 tail=b;
				 b=b.next;			 
			 }
		 }
		 if(a==null)tail.next=b;
		 if(b==null)tail.next=a;
		 return head;
	 }
	 
	//Palindrome Linked list;
	 
	 static boolean isPalindrome(node head) {
		 node cur=head;
		 node slow=head;
		 node fast=head.next;
		 
		 while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast==null) {
			slow=slow.next;
		}
		node rev=null;
		while(slow!=null) {
			node temp=slow.next;
			slow.next=rev;
			rev=slow;
			slow=temp;
		}
		slow=rev;
		while(slow!=null && cur!=null) {
			if(slow.data!=cur.data)return false;
			slow=slow.next;
			cur=cur.next;
		}
		return true;
	 }
	 
	 
	 //Palindrome Linked list using findMidElement and reverseL;
	 static boolean Palindrome(node head) {
		 node cur=head;
		 node mid=findMidElement(head);
		 node rev=reverseL(mid);
		 printL(cur);
		 while(rev!=null) {
				if(rev.data!=cur.data)return false;
				rev=rev.next;
				cur=cur.next;
			}
			return true;
	 }
	 
	 
	 //Main method.
	public static void main(String[] args) {

		//Create Link list
		node n1=new node(10);
		node n2=new node(20);
		node n3=new node(30);
		node n4=new node(40);
		node n5=new node(50);
		node n6=new node(40);
//		node n7=new node(70);
//		node n8=new node(80);
//		node n9=new node(90);
		node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=new node(30);
		n6.next.next=new node(20);
		n6.next.next.next=new node(10);
		printL(head);
		//insert new node at start,end,middle(any node in between)
//		head=insertL(5,0,head);
//		printL(head);
//		head=insertL(70,7,head);
//		printL(head);
//		head=insertL(25,3,head);
//		printL(head);
		
		//Delete operation from start,end and middle(any node in between)
//		head=deleteL(0,head);
//		printL(head);
//		head=deleteL(4,head);
//		printL(head);
//		head=deleteL(1,head);
//		printL(head);
		
		//Find the middle element in a LL
		node mid=findMidElement(head);
		System.out.println("mid element: "+mid.data);
		printL(head);
		
		//Reverse a LL
//		head=reverseL(head);
//		printL(head);
		
		//Reverse LL using recursion
//		head=reverseRecursionL(head);
//		printL(head);
		//Reverse first K elements of a LL
//		head=reversePosL(head,3);
//		printL(head);
		
//		//Reverse first k elements of a LL
//		head=reverseInGroupOfK(head,3);
//		printL(head);
		
		//Merge two shorted LL
//		node h1=n1;
//		h1.next=n3;
//		n3.next=n5;
//		n5.next=n7;
//		n7.next=n9;
//		printL(h1);
//		node h2=n2;
//		h2.next=n4;
//		n4.next=n6;
//		n6.next=n8;
//		printL(h2);
//		node h=mergeL(h1,h2);
//		printL(h);
		
		//Palindrome Linked list;
//		if(isPalindrome(head)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("not Palindrome");
//		}
		if(Palindrome(head)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

static class node{
	int data;
	node next;
	public node(int data) {
		this.data = data;
	}
	public node() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

}
