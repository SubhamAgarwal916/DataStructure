package Array;

public class Class1 {
	
	
	//------------------------------------Search Element-------------------------------------------------//
	
	
	static int searchElement(int a[],int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)return i;
		}
		return -1;
	}
	
	
	//-------------------------Delete 1st occurrence of an element from an array-----------------------//
	
	
	
	static void Delete(int a[],int n) {
		int index=searchElement(a,n);
		if(index==-1) {System.out.println(n+"not fount in the array");
			return;}
		for(int i=index;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		System.out.println(n+" is successfully deleted from arrray");
	}
	
	
	//-------------------------Delete all occurrence of an element from an array-----------------------//
	
	
	
	static void DeleteAll(int a[],int n,int l) {
		int index=searchElement(a,n);
		if(index==l-1) {
			System.out.println(n+" is successfully deleted from arrray");
			return;
		}
		if(index==-1) {
			if(l==a.length)System.out.println(n+" not found in the array");
			else System.out.println(n+" is successfully deleted from arrray");
		return;
		}
		
		for(int i=index;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		DeleteAll(a,n,l-1);
	}
	
	
	//---------------------------------Largest------------------------------------------------------//
	
	
	static int largest(int[]a) {
		int max=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[max]) {
				max=i;
			}
		}
		return max;
	}
	
	
	//-------------------------------second Largest -----------------------------------------------//
	
	
	static int secondLargest(int a[]) {
		int l1=0;
		int l2=0;
		boolean check=false;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=l1) {
				if(a[i]>a[l1]) {
					l2=l1;
					l1=i;
					check=true;
				}
				else if(a[i]>a[l2] && check) {
					l2=i;
				}
			}	
		}
		if(check)return l2;
		return -1;
	}
	
	
	//----------------Remove Duplicate from shorted array{ SC-O(1),TC-O(n) }----------------------------//

	
	static void removeDuplicate(int a[]) {
		for(int i=1,j=0;i<a.length;i++) {
			if(a[j]!=a[i]) {
				j++;
				a[j]=a[i];
			}
		}
	}
			
	//-----------------------------------Main Method ---------------------------------------------------//
	
	
	public static void main(String[] args) {
		//search element
		int a[]= {5,5,7,7,8,8,8,8,23,32,32,45,45,55,55};
		//int l=a.length;
		//DeleteAll(a,6,l);
		//Delete(a,7);
		removeDuplicate(a);
		for(int e:a)System.out.println(e);
		//System.out.println(searchElement(a,7));
		//System.out.println(secondLargest(a));
	}

}
