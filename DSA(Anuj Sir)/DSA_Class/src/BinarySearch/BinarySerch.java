package BinarySearch;
//using Recursion
public class BinarySerch {
	static int BinarySerch1(int a[], int e,int l,int r) {
		int mid=(l+r)/2;
		if(mid>r || mid<l)return -1;
		if(a[mid]==e)return mid;
		if(a[mid]>e) {
			return BinarySerch1(a, e, l, mid-1);
		}
		else return BinarySerch1(a, e, mid+1, r);
	}
//using while loop
	static int BinarySerch2(int a[], int e) {
		int l=0;
		int r=a.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]==e)return mid;
			if(e>a[mid])l=mid+1;
			else r=mid-1;
		}
		return -1;
	}
//1st occurrence of an element from left
	static int leftOccurrence(int a[],int e) {
		int l=0;
		int r=a.length-1;
		int ans=-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]==e) {
				ans=mid;
				r=mid-1;
			
			}
			else if(e>a[mid])l=mid+1;
			else r=mid-1;
		}
		return ans;
	}
	
	static int rightOccurrence(int a[],int e) {
		int l=0;
		int r=a.length-1;
		int ans=-1;
		while(l<=r) {
			int mid=(l+r)/2;
			System.out.println(mid+" "+l+" "+r);
			if(a[mid]==e) {
				ans=mid;
				l=mid+1;
			}
			else if(e>a[mid])l=mid+1;
			else r=mid-1;
		}
		return ans;
	}
	
	static int countNoOfOccurance(int a[],int e) {
		int count=0;
		int i=leftOccurrence(a, e);
		if(i==-1)return count;
		while(a[i]==e) {
			count++;
			i++;
			if(i>=a.length)break;
		}
		return count;
	}
	
	static int searchRotatedSorted(int a[],int e) {
		int l=0;
		int r=a.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(a[mid]==e)return mid;
			if(a[mid]>=a[l]) {
				if(e>=a[l] && e<a[mid])r=mid-1;
				else l=mid+1;
			}
			else
			{
				if(e<=a[r] && e>a[mid])l=mid+1;
				else r=mid-1;

			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]= {4,3};
		System.out.println(searchRotatedSorted(a,4));
	}

}
