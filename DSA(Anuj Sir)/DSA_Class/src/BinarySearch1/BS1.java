package BinarySearch1;

public class BS1 {
	
	static int BinarySerch(int a[], int key, int l, int r) {
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(a[mid]==key)return mid;
			if(a[mid]>key)r=mid-1;
			else l=mid+1;
		}return -1;
	}
	
	static int SerchInInfiniteSortedArray(int a[], int key) {
		int r=1;
		int l=0;
		while(a[r]<=key) {
			if(a[r]==key)return r;
			l=r;
			r=r*2;
		}
		return BinarySerch(a,key,l,r);
	}
	static int SquareRoot(int n) {
		int ans =1;
		int l=1, r=n;
		while(l<=r) {
			int mid=(l+r)/2;
			if(mid*mid==n)return mid;
			if(mid*mid >n)r=mid-1;
			else {
				ans=mid;
				l=mid+1;
			}
		}
		return ans;
	}
	
	static double findMedianInTwoSortedArray(int a1[], int a2[]) {
		int n1=a1.length;
		int n2=a2.length;
		if(n1>n2)return findMedianInTwoSortedArray(a2,a1);
		
		//function
		int l=0;
		int r=n1;
		while(l<=r) {
			int m1=(l+r)/2;
			int m2=(n1+n2+1)/2-m1;
		
			int max1=m1==0?Integer.MIN_VALUE :a1[m1-1];
			int max2=m2==0?Integer.MIN_VALUE :a2[m2-1];
			int min1=m1==n1?Integer.MAX_VALUE:a1[m1];
			int min2=m2==n2?Integer.MAX_VALUE:a2[m2];
			
			if(max1<=min2 && max2<=min1) {
				if((n1+n2)%2==0) {
					return ((double)Math.max(max1, max2)+(double)Math.min(min1, min2))/2;
				}
				else return Math.max(max1, max2);
			}
			
			else if(max1>min2) {
				r=m1-1;
			}
			else l=m1+1;
		}
		return 0.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {1,2,3,4,6,7,8,11,13,14,17,17,19,23,31,34,36,37};
		//int a1[]= {1,6,9,13,15};
		//int a2[]= {1,3,10}; //1,1,3,6,9,10,13,15 median=(6+9)/2=7.5
		//System.out.println(findMedianInTwoSortedArray(a1,a2));
		//System.out.println(SerchInInfiniteSortedArray(a, 36));
		//System.out.println(SquareRoot(8));
	}

}


