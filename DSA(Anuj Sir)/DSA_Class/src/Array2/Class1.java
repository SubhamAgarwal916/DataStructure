package Array2;

public class Class1 {
	
	static int[] leader(int a[]) {
		int n=a.length-1;
		int[] leader=new int[a.length];
		int max=0;
		int j=0;
		for(int i=n;i>=0;i--) {
			if(a[i]>max) {
				leader[j]=a[i];
				max=a[i];
				j++;
			}
		}
		for(int i=0,k=j-1;i<j;i++,k--) {
			int temp= leader[i];
			leader[i]=leader[k];
			leader[k]=temp;
		}
		return leader;
	}
	static int maxSumSubArray(int a[]) {
		int max=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(sum>max) max=sum;
			if(sum<0)sum=0;
		}
		return max;
	}
	
	static int maxWater(int a[]) {
		int max=0;
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			int dis=j-i;
			int height=Math.min(a[i],a[j]);
			int area=dis*height;
			max=Math.max(max, area);
		}
		return max;
	}
	static int maxWater1(int a[]) {
		int lMax=-1;
		int rMax=-1;
		int tot=0;
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			if(a[i]>lMax)lMax=a[i];
			if(a[j]>rMax)rMax=a[j];
			int area=Math.min(rMax,lMax)-a[i];
			tot+=area;
			}
		return tot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,6,1,4,3};
		for(int e:leader(a)) {
			System.out.println(e);
		}
	}

}
