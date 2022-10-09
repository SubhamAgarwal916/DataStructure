package Array;

public class PracticeProblems {
	
	//-----------------Problem-1:Smallest Element---------------------------//
	
	static int smallest(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[min]>a[i])min=i;
		}
		return min;
	}
	
	
	//-------------------Problem-2:3rd largest element------------------------//
	
	static int thirdLargest(int a[]) {
		int l1=0;
		int l2=-1,l3=-1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[l1]) {
				if(a[i]>a[l1]) {
					l3=l2;
					l2=l1;
					l1=i;
				}
				else if(l2!=-1) {
					if(a[i]>a[l2]) {
					l3=l2;
					l2=a[i];
					}
					else if(a[i]!=a[l2]) {
						if(a[i]>a[l3])l3=i;
					}
				}
			}
		}
		return l3;	
	}
	
//----------------------------------Problem-3:Check if array is shorted----------------------------------------//
	
	static boolean isShorted(int a[]) {
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1])return false;
		}
		return true;
	}
	
//------------------------------------Problem-4: Reverse the given array-------------------------------------//
	
	static void reverse(int a[]) {
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

//-----------------------Problem-5: Replace every element to the greatest element to its right----------------//
	
	static void Replace(int a[]) {
		int max=0;
		for(int i=a.length-1;i>=0;i--) {
			int temp=a[i];
			a[i]=max;
			if(temp>max)max=temp;
		}
	}

	
//----------------------------------------------------------------------------------------------------------------//
	
}
